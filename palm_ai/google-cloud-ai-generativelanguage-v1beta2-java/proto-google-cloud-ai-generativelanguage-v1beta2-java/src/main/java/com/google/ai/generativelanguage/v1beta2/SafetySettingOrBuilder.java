// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta2/safety.proto

package com.google.ai.generativelanguage.v1beta2;

public interface SafetySettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta2.SafetySetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The category for this setting.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta2.HarmCategory category = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <pre>
   * Required. The category for this setting.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta2.HarmCategory category = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The category.
   */
  com.google.ai.generativelanguage.v1beta2.HarmCategory getCategory();

  /**
   * <pre>
   * Required. Controls the probability threshold at which harm is blocked.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta2.SafetySetting.HarmBlockThreshold threshold = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for threshold.
   */
  int getThresholdValue();
  /**
   * <pre>
   * Required. Controls the probability threshold at which harm is blocked.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta2.SafetySetting.HarmBlockThreshold threshold = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The threshold.
   */
  com.google.ai.generativelanguage.v1beta2.SafetySetting.HarmBlockThreshold getThreshold();
}