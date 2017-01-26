package com.misc.common.moplaf.kpiview.medusa.views;
/*
 * Copyright (c) 2016 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import eu.hansolo.medusa.Fonts;
import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.Section;
import eu.hansolo.medusa.tools.Helper;
import javafx.geometry.Insets;
import javafx.scene.control.Skin;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.List;
import java.util.Locale;

import static eu.hansolo.medusa.tools.Helper.clamp;


/**
 * Created by hansolo on 30.11.16.
 */
public class GaugeSkinTypeTilePercentage extends SkinBase<Gauge> implements Skin<Gauge> {
    private static final double        PREFERRED_WIDTH  = 250;
    private static final double        PREFERRED_HEIGHT = 250;
    private static final double        MINIMUM_WIDTH    = 50;
    private static final double        MINIMUM_HEIGHT   = 50;
    private static final double        MAXIMUM_WIDTH    = 1024;
    private static final double        MAXIMUM_HEIGHT   = 1024;
    private              double        size;
	private              Background    barBackgroundBG;
	private              Border        paneBorder;
    private              Background    paneBG;
    private              Region        barBackground;
    private              Rectangle     barClip;
    private              Rectangle     bar;
    private              Text          titleText;
    private              Text          valueText;
    private              Text          unitText;
    private              Text          percentageText;
    private              Text          percentageUnitText;
    private              Rectangle     maxValueRect;
    private              Text          maxValueText;
    private              Text          maxValueUnitText;
    private              Pane          pane;
    private              double        minValue;
    private              double        maxValue;
    private              double        range;
    private              double        stepSize;
    private              String        formatString;
    private              Locale        locale;
    private              List<Section> sections;
    private              boolean       sectionsVisible;
    private              Color         barColor;


    // ******************** Constructors **************************************
    public GaugeSkinTypeTilePercentage(Gauge gauge) {
        super(gauge);
        if (gauge.isAutoScale()) gauge.calcAutoScale();
        minValue        = gauge.getMinValue();
        maxValue        = gauge.getMaxValue();
        range           = gauge.getRange();
        stepSize        = PREFERRED_WIDTH / range;
        formatString    = new StringBuilder("%.").append(Integer.toString(gauge.getDecimals())).append("f").toString();
        locale          = gauge.getLocale();
        sections        = gauge.getSections();
        sectionsVisible = gauge.getSectionsVisible();
        barColor        = gauge.getBarColor();

        initGraphics();
        registerListeners();

        setBar(gauge.getCurrentValue());
    }


    // ******************** Initialization ************************************
    private void initGraphics() {
    	Gauge gauge = this.getSkinnable();
    	
    	// note: this implementation does not support background modification after initialization
		barBackgroundBG = new Background(new BackgroundFill(gauge.getBarBackgroundColor(), 
				                         new CornerRadii(0.0, 0.0, 0.025, 0.025, true), 
				                         Insets.EMPTY));
		paneBorder = new Border(new BorderStroke(gauge.getBorderPaint(), BorderStrokeStyle.SOLID, 
				                new CornerRadii(PREFERRED_WIDTH * 0.025), 
				                new BorderWidths(gauge.getBorderWidth())));
        paneBG = new Background(new BackgroundFill(gauge.getBackgroundPaint(), 
        		                new CornerRadii(PREFERRED_WIDTH * 0.025), 
        		                Insets.EMPTY));

        // Set initial size
        if (Double.compare(gauge.getPrefWidth(), 0.0) <= 0 || Double.compare(gauge.getPrefHeight(), 0.0) <= 0 ||
            Double.compare(gauge.getWidth(), 0.0) <= 0 || Double.compare(gauge.getHeight(), 0.0) <= 0) {
            if (gauge.getPrefWidth() > 0 && gauge.getPrefHeight() > 0) {
                gauge.setPrefSize(gauge.getPrefWidth(), gauge.getPrefHeight());
            } else {
                gauge.setPrefSize(PREFERRED_WIDTH, PREFERRED_HEIGHT);
            }
        }

        barBackground = new Region();
		barBackground.setBackground(this.barBackgroundBG);

        barClip = new Rectangle();

        bar = new Rectangle();
        bar.setFill(gauge.getBarColor());
        bar.setStroke(null);
        bar.setClip(barClip);

        titleText = new Text();
        titleText.setFill(gauge.getTitleColor());
        Helper.enableNode(titleText, !gauge.getTitle().isEmpty());

        valueText = new Text();
        valueText.setFill(gauge.getValueColor());
        Helper.enableNode(valueText, gauge.isValueVisible());

        unitText = new Text(gauge.getUnit());
        unitText.setFill(gauge.getUnitColor());
        Helper.enableNode(unitText, !gauge.getUnit().isEmpty());

        percentageText = new Text();
        percentageText.setFill(gauge.getBarColor());

        percentageUnitText = new Text("%");
        percentageUnitText.setFill(gauge.getBarColor());

        maxValueRect = new Rectangle();
        maxValueRect.setFill(gauge.getThresholdColor());

        maxValueText = new Text();
        maxValueText.setFill(gauge.getBackgroundPaint());

        maxValueUnitText = new Text(gauge.getUnit());
        maxValueUnitText.setFill(gauge.getBackgroundPaint());

        pane = new Pane(barBackground, bar, titleText, valueText, unitText, percentageText, percentageUnitText, maxValueRect, maxValueText, maxValueUnitText);
		pane.setBorder(this.paneBorder);
        pane.setBackground(this.paneBG);

        getChildren().setAll(pane);
    }
    

    private void registerListeners() {
    	Gauge gauge = this.getSkinnable();
        gauge.widthProperty().addListener(o -> handleEvents("RESIZE"));
        gauge.heightProperty().addListener(o -> handleEvents("RESIZE"));
        gauge.setOnUpdate(e -> handleEvents(e.eventType.name()));
        gauge.currentValueProperty().addListener(o -> setBar(gauge.getCurrentValue()));
    }


    // ******************** Methods *******************************************
    @Override protected double computeMinWidth(final double HEIGHT, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT)  { return MINIMUM_WIDTH; }
    @Override protected double computeMinHeight(final double WIDTH, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT)  { return MINIMUM_HEIGHT; }
    @Override protected double computePrefWidth(final double HEIGHT, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT) { return super.computePrefWidth(HEIGHT, TOP, RIGHT, BOTTOM, LEFT); }
    @Override protected double computePrefHeight(final double WIDTH, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT) { return super.computePrefHeight(WIDTH, TOP, RIGHT, BOTTOM, LEFT); }
    @Override protected double computeMaxWidth(final double HEIGHT, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT)  { return MAXIMUM_WIDTH; }
    @Override protected double computeMaxHeight(final double WIDTH, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT)  { return MAXIMUM_HEIGHT; }

    private void handleEvents(final String EVENT_TYPE) {
    	Gauge gauge = this.getSkinnable();
        if ("RESIZE".equals(EVENT_TYPE)) {
            resize();
            redraw();
        } else if ("REDRAW".equals(EVENT_TYPE)) {
            redraw();
        } else if ("RECALC".equals(EVENT_TYPE)) {
            minValue = gauge.getMinValue();
            maxValue = gauge.getMaxValue();
            range    = gauge.getRange();
            stepSize = size / range;
            redraw();
        } else if ("VISIBLITY".equals(EVENT_TYPE)) {
            Helper.enableNode(titleText, !gauge.getTitle().isEmpty());
            Helper.enableNode(valueText, gauge.isValueVisible());
            Helper.enableNode(unitText, !gauge.getUnit().isEmpty());
        } else if ("SECTION".equals(EVENT_TYPE)) {
            sections = gauge.getSections();
        }
    }

    private void setBar(final double VALUE) {
    	Gauge gauge = this.getSkinnable();
		//CommonPlugin.INSTANCE.log("MoplafSkinType: setBar");
        double targetValue = (clamp(minValue, maxValue, VALUE) - minValue) * stepSize;
        bar.setWidth(targetValue);
        valueText.setText(String.format(locale, formatString, VALUE));
        percentageText.setText(String.format(locale, formatString, ((VALUE - minValue) / range * 100)));
        maxValueRect.setFill(VALUE > gauge.getThreshold() ? barColor : gauge.getThresholdColor());
        resizeDynamicText();
        if (sectionsVisible && !sections.isEmpty()) { setBarColor(VALUE); }
    }

    private void setBarColor(final double VALUE) {
        Color color = barColor;
        for(Section section : sections) {
            if (section.contains(VALUE)) {
                color = section.getColor();
                break;
            }
        }
        bar.setFill(color);
        percentageText.setFill(color);
        percentageUnitText.setFill(color);
    }


    // ******************** Resizing ******************************************
    private void resizeDynamicText() {
        double maxWidth = unitText.isVisible() ? size * 0.725 : size * 0.9;
        double fontSize = 0.24 * size;
        valueText.setFont(Fonts.latoRegular(fontSize));
        if (valueText.getLayoutBounds().getWidth() > maxWidth) { Helper.adjustTextSize(valueText, maxWidth, fontSize); }
        if (unitText.isVisible()) {
            valueText.relocate(size * 0.925 - valueText.getLayoutBounds().getWidth() - unitText.getLayoutBounds().getWidth(), size * 0.15);
        } else {
            valueText.relocate(size * 0.95 - valueText.getLayoutBounds().getWidth(), size * 0.15);
        }

        percentageUnitText.relocate(percentageText.getLayoutBounds().getMaxX() + size * 0.075, size * 0.75);
    }
    private void resizeStaticText() {
        double maxWidth = size * 0.9;
        double fontSize = size * 0.06;

        titleText.setFont(Fonts.latoRegular(fontSize));
        if (titleText.getLayoutBounds().getWidth() > maxWidth) { Helper.adjustTextSize(titleText, maxWidth, fontSize); }
        titleText.relocate(size * 0.05, size * 0.05);

        maxWidth = size * 0.15;
        unitText.setFont(Fonts.latoRegular(fontSize));
        if (unitText.getLayoutBounds().getWidth() > maxWidth) { Helper.adjustTextSize(unitText, maxWidth, fontSize); }
        unitText.relocate(size * 0.95 - unitText.getLayoutBounds().getWidth(), size * 0.3275);

        maxWidth = size * 0.45;
        fontSize = size * 0.18;
        percentageText.setFont(Fonts.latoRegular(fontSize));
        if (percentageText.getLayoutBounds().getWidth() > maxWidth) { Helper.adjustTextSize(percentageText, maxWidth, fontSize); }
        percentageText.relocate(size * 0.05, size * 0.695);

        maxWidth = size * 0.1;
        fontSize = size * 0.12;
        percentageUnitText.setFont(Fonts.latoRegular(fontSize));
        if (percentageUnitText.getLayoutBounds().getWidth() > maxWidth) { Helper.adjustTextSize(percentageUnitText, maxWidth, fontSize); }
        percentageUnitText.relocate(percentageText.getLayoutBounds().getMaxX() + size * 0.075, size * 0.75);

        maxWidth = size * 0.2;
        fontSize = size * 0.05;
        maxValueUnitText.setFont(Fonts.latoRegular(fontSize));
        if (maxValueUnitText.getLayoutBounds().getWidth() > maxWidth) { Helper.adjustTextSize(maxValueUnitText, maxWidth, fontSize); }
        maxValueUnitText.setX((size * 0.925) - maxValueUnitText.getLayoutBounds().getWidth());
        maxValueUnitText.setY(size * 0.855);

        maxWidth = size * 0.45;
        fontSize = size * 0.08;
        maxValueText.setFont(Fonts.latoRegular(fontSize));
        if (maxValueText.getLayoutBounds().getWidth() > maxWidth) { Helper.adjustTextSize(maxValueText, maxWidth, fontSize); }
        if (unitText.isVisible()) {
            maxValueText.setX((size * 0.925) - (size * 0.01 + maxValueText.getLayoutBounds().getWidth() + maxValueUnitText.getLayoutBounds().getWidth()));
        } else {
            maxValueText.setX((size * 0.925) - maxValueText.getLayoutBounds().getWidth());
        }
        maxValueText.setY(size * 0.855);
    }

    private void resize() {
    	Gauge gauge = this.getSkinnable();
        double width  = gauge.getWidth() - gauge.getInsets().getLeft() - gauge.getInsets().getRight();
        double height = gauge.getHeight() - gauge.getInsets().getTop() - gauge.getInsets().getBottom();
        size          = width < height ? width : height;

        stepSize      = size / range;

        if (width > 0 && height > 0) {
            pane.setMaxSize(size, size);
            pane.relocate((width - size) * 0.5, (height - size) * 0.5);
            barBackground.setPrefSize(size, size * 0.035);
            barBackground.relocate(0, size * 0.965);

            barClip.setX(0);
            barClip.setY(size * 0.95);
            barClip.setWidth(size);
            barClip.setHeight(size * 0.05);
            barClip.setArcWidth(size * 0.025);
            barClip.setArcHeight(size * 0.025);

            bar.setX(0);
            bar.setY(size * 0.965);
            bar.setWidth(clamp(minValue, maxValue, gauge.getCurrentValue()) * stepSize);
            bar.setHeight(size * 0.035);

            resizeStaticText();
            resizeDynamicText();

            maxValueRect.setWidth((maxValueText.getLayoutBounds().getWidth() + maxValueUnitText.getLayoutBounds().getWidth()) + size * 0.06);
            maxValueRect.setHeight(maxValueText.getLayoutBounds().getHeight() * 1.01);
            maxValueRect.setX((size * 0.95) - maxValueRect.getWidth());
            maxValueRect.setY(size * 0.7775);
            maxValueRect.setArcWidth(size * 0.025);
            maxValueRect.setArcHeight(size * 0.025);
        }
    }

    private void redraw() {
    	Gauge gauge = this.getSkinnable();
//		CommonPlugin.INSTANCE.log("MoplafSkinType: redraw");

        locale       = gauge.getLocale();
        formatString = new StringBuilder("%.").append(Integer.toString(gauge.getDecimals())).append("f").toString();

        titleText.setText(gauge.getTitle());
        percentageText.setText(String.format(locale, "%." + gauge.getTickLabelDecimals() + "f", gauge.getValue() / range * 100));
        
        double maxValueTmp = gauge.getThreshold();
        String maxValueTmpS = String.format(locale, "%." + gauge.getTickLabelDecimals() + "f", maxValueTmp); 
        maxValueText.setText(maxValueTmpS);
//        maxValueText.setManaged(true);
//        maxValueText.setVisible(true);

        maxValueUnitText.setText(gauge.getUnit());

        resizeStaticText();

        barColor = gauge.getBarColor();

        if (sectionsVisible && !sections.isEmpty()) {
            setBarColor(gauge.getValue());
        } else {
            bar.setFill(barColor);
        }

        titleText.setFill(gauge.getTitleColor());
//        maxValueText.setFill(gauge.getBackgroundPaint());
//        maxValueUnitText.setFill(gauge.getBackgroundPaint());
        maxValueText.setFill(gauge.getValueColor());
        maxValueUnitText.setFill(gauge.getValueColor());
        valueText.setFill(gauge.getValueColor());
        unitText.setFill(gauge.getUnitColor());
    }
}
