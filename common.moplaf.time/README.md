common.moplaf.time
==================

Component allowing to manage time in an EMF application
- discrete time
  - generate time buckets (hours, days, weeks, months)
  - merge buckets of different types
- continuous time
  - distribution object (generalize function of time, allowing discontinuities)
  - capacity changes (change of a delta on a period of time)
  - stock changes (change with a given rate on a period of time)
  - queries on a distribution (average/max/min value at some time, earliest time when possible)
  - aggregation of distributions
