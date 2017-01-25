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

//import org.eclipse.emf.common.CommonPlugin;

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
//		CommonPlugin.INSTANCE.log("MoplafSkinType: initGraphics");
        // Set initial size
        if (Double.compare(getSkinnable().getPrefWidth(), 0.0) <= 0 || Double.compare(getSkinnable().getPrefHeight(), 0.0) <= 0 ||
            Double.compare(getSkinnable().getWidth(), 0.0) <= 0 || Double.compare(getSkinnable().getHeight(), 0.0) <= 0) {
            if (getSkinnable().getPrefWidth() > 0 && getSkinnable().getPrefHeight() > 0) {
                getSkinnable().setPrefSize(getSkinnable().getPrefWidth(), getSkinnable().getPrefHeight());
            } else {
                getSkinnable().setPrefSize(PREFERRED_WIDTH, PREFERRED_HEIGHT);
            }
        }

        barBackground = new Region();
        barBackground.setBackground(new Background(new BackgroundFill(getSkinnable().getBarBackgroundColor(), new CornerRadii(0.0, 0.0, 0.025, 0.025, true), Insets.EMPTY)));

        barClip = new Rectangle();

        bar = new Rectangle();
        bar.setFill(getSkinnable().getBarColor());
        bar.setStroke(null);
        bar.setClip(barClip);

        titleText = new Text();
        titleText.setFill(getSkinnable().getTitleColor());
        Helper.enableNode(titleText, !getSkinnable().getTitle().isEmpty());

        valueText = new Text();
        valueText.setFill(getSkinnable().getValueColor());
        Helper.enableNode(valueText, getSkinnable().isValueVisible());

        unitText = new Text(getSkinnable().getUnit());
        unitText.setFill(getSkinnable().getUnitColor());
        Helper.enableNode(unitText, !getSkinnable().getUnit().isEmpty());

        percentageText = new Text();
        percentageText.setFill(getSkinnable().getBarColor());

        percentageUnitText = new Text("%");
        percentageUnitText.setFill(getSkinnable().getBarColor());

        maxValueRect = new Rectangle();
        maxValueRect.setFill(getSkinnable().getThresholdColor());

        maxValueText = new Text();
        maxValueText.setFill(getSkinnable().getBackgroundPaint());

        maxValueUnitText = new Text(getSkinnable().getUnit());
        maxValueUnitText.setFill(getSkinnable().getBackgroundPaint());

        pane = new Pane(barBackground, bar, titleText, valueText, unitText, percentageText, percentageUnitText, maxValueRect, maxValueText, maxValueUnitText);
        pane.setBorder(new Border(new BorderStroke(getSkinnable().getBorderPaint(), BorderStrokeStyle.SOLID, new CornerRadii(PREFERRED_WIDTH * 0.025), new BorderWidths(getSkinnable().getBorderWidth()))));
        pane.setBackground(new Background(new BackgroundFill(getSkinnable().getBackgroundPaint(), new CornerRadii(PREFERRED_WIDTH * 0.025), Insets.EMPTY)));

        getChildren().setAll(pane);
    }

    private void registerListeners() {
        getSkinnable().widthProperty().addListener(o -> handleEvents("RESIZE"));
        getSkinnable().heightProperty().addListener(o -> handleEvents("RESIZE"));
        getSkinnable().setOnUpdate(e -> handleEvents(e.eventType.name()));
        getSkinnable().currentValueProperty().addListener(o -> setBar(getSkinnable().getCurrentValue()));
    }


    // ******************** Methods *******************************************
    @Override protected double computeMinWidth(final double HEIGHT, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT)  { return MINIMUM_WIDTH; }
    @Override protected double computeMinHeight(final double WIDTH, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT)  { return MINIMUM_HEIGHT; }
    @Override protected double computePrefWidth(final double HEIGHT, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT) { return super.computePrefWidth(HEIGHT, TOP, RIGHT, BOTTOM, LEFT); }
    @Override protected double computePrefHeight(final double WIDTH, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT) { return super.computePrefHeight(WIDTH, TOP, RIGHT, BOTTOM, LEFT); }
    @Override protected double computeMaxWidth(final double HEIGHT, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT)  { return MAXIMUM_WIDTH; }
    @Override protected double computeMaxHeight(final double WIDTH, final double TOP, final double RIGHT, final double BOTTOM, final double LEFT)  { return MAXIMUM_HEIGHT; }

    private void handleEvents(final String EVENT_TYPE) {
        if ("RESIZE".equals(EVENT_TYPE)) {
            resize();
            redraw();
        } else if ("REDRAW".equals(EVENT_TYPE)) {
            redraw();
        } else if ("RECALC".equals(EVENT_TYPE)) {
            minValue = getSkinnable().getMinValue();
            maxValue = getSkinnable().getMaxValue();
            range    = getSkinnable().getRange();
            stepSize = size / range;
            redraw();
        } else if ("VISIBLITY".equals(EVENT_TYPE)) {
            Helper.enableNode(titleText, !getSkinnable().getTitle().isEmpty());
            Helper.enableNode(valueText, getSkinnable().isValueVisible());
            Helper.enableNode(unitText, !getSkinnable().getUnit().isEmpty());
        } else if ("SECTION".equals(EVENT_TYPE)) {
            sections = getSkinnable().getSections();
        }
    }

    private void setBar(final double VALUE) {
//		CommonPlugin.INSTANCE.log("MoplafSkinType: setBar");
        double targetValue = (clamp(minValue, maxValue, VALUE) - minValue) * stepSize;
        bar.setWidth(targetValue);
        valueText.setText(String.format(locale, formatString, VALUE));
        percentageText.setText(String.format(locale, formatString, ((VALUE - minValue) / range * 100)));
        maxValueRect.setFill(VALUE > getSkinnable().getThreshold() ? barColor : getSkinnable().getThresholdColor());
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
        double width  = getSkinnable().getWidth() - getSkinnable().getInsets().getLeft() - getSkinnable().getInsets().getRight();
        double height = getSkinnable().getHeight() - getSkinnable().getInsets().getTop() - getSkinnable().getInsets().getBottom();
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
            bar.setWidth(clamp(minValue, maxValue, getSkinnable().getCurrentValue()) * stepSize);
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
//		CommonPlugin.INSTANCE.log("MoplafSkinType: redraw");
        pane.setBorder(new Border(new BorderStroke(getSkinnable().getBorderPaint(), BorderStrokeStyle.SOLID, new CornerRadii(size * 0.025), new BorderWidths(getSkinnable().getBorderWidth() / PREFERRED_WIDTH * size))));
        pane.setBackground(new Background(new BackgroundFill(getSkinnable().getBackgroundPaint(), new CornerRadii(size * 0.025), Insets.EMPTY)));

        locale       = getSkinnable().getLocale();
        formatString = new StringBuilder("%.").append(Integer.toString(getSkinnable().getDecimals())).append("f").toString();

        titleText.setText(getSkinnable().getTitle());
        percentageText.setText(String.format(locale, "%." + getSkinnable().getTickLabelDecimals() + "f", getSkinnable().getValue() / range * 100));
        
        double maxValueTmp = getSkinnable().getThreshold();
        String maxValueTmpS = String.format(locale, "%." + getSkinnable().getTickLabelDecimals() + "f", maxValueTmp); 
        maxValueText.setText(maxValueTmpS);
//        maxValueText.setManaged(true);
//        maxValueText.setVisible(true);

        maxValueUnitText.setText(getSkinnable().getUnit());

        resizeStaticText();

        barBackground.setBackground(new Background(new BackgroundFill(getSkinnable().getBarBackgroundColor().brighter().brighter(), new CornerRadii(0.0, 0.0, size * 0.025, size * 0.025, false), Insets.EMPTY)));
        barColor = getSkinnable().getBarColor();

        if (sectionsVisible && !sections.isEmpty()) {
            setBarColor(getSkinnable().getValue());
        } else {
            bar.setFill(barColor);
        }

        titleText.setFill(getSkinnable().getTitleColor());
//        maxValueText.setFill(getSkinnable().getBackgroundPaint());
//        maxValueUnitText.setFill(getSkinnable().getBackgroundPaint());
        maxValueText.setFill(getSkinnable().getValueColor());
        maxValueUnitText.setFill(getSkinnable().getValueColor());
        valueText.setFill(getSkinnable().getValueColor());
        unitText.setFill(getSkinnable().getUnitColor());
    }
}
