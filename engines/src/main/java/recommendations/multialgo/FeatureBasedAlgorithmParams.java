package io.prediction.engines.java.recommendations.multialgo;

import io.prediction.controller.Params;

// actual score = (rating - drift) / scale if min <= rating <= max
// if rating is outside [min, max], that scoring will not be used.
public class FeatureBasedAlgorithmParams implements Params {
  public final double min;
  public final double max;
  public final double drift;
  public final double scale;

  public FeatureBasedAlgorithmParams(double min, double max, double drift, double scale) {
    this.min = min;
    this.max = max;
    this.drift = drift;
    this.scale = scale;
  }
  
  public FeatureBasedAlgorithmParams(double min, double max) {
    this(min, max, 0.0, 1.0);
  }
}
