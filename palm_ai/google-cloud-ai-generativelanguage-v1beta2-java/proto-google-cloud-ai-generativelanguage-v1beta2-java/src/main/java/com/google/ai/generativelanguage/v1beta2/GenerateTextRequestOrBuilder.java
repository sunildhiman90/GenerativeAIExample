// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ai/generativelanguage/v1beta2/text_service.proto

package com.google.ai.generativelanguage.v1beta2;

public interface GenerateTextRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ai.generativelanguage.v1beta2.GenerateTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The model name to use with the format name=models/{model}.
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Required. The model name to use with the format name=models/{model}.
   * </pre>
   *
   * <code>string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Required. The free-form input text given to the model as a prompt.
   * Given a prompt, the model will generate a TextCompletion response it
   * predicts as the completion of the input text.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta2.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the prompt field is set.
   */
  boolean hasPrompt();
  /**
   * <pre>
   * Required. The free-form input text given to the model as a prompt.
   * Given a prompt, the model will generate a TextCompletion response it
   * predicts as the completion of the input text.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta2.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The prompt.
   */
  com.google.ai.generativelanguage.v1beta2.TextPrompt getPrompt();
  /**
   * <pre>
   * Required. The free-form input text given to the model as a prompt.
   * Given a prompt, the model will generate a TextCompletion response it
   * predicts as the completion of the input text.
   * </pre>
   *
   * <code>.google.ai.generativelanguage.v1beta2.TextPrompt prompt = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ai.generativelanguage.v1beta2.TextPromptOrBuilder getPromptOrBuilder();

  /**
   * <pre>
   * Controls the randomness of the output.
   * Note: The default value varies by model, see the `Model.temperature`
   * attribute of the `Model` returned the `getModel` function.
   * Values can range from [0.0,1.0],
   * inclusive. A value closer to 1.0 will produce responses that are more
   * varied and creative, while a value closer to 0.0 will typically result in
   * more straightforward responses from the model.
   * </pre>
   *
   * <code>optional float temperature = 3;</code>
   * @return Whether the temperature field is set.
   */
  boolean hasTemperature();
  /**
   * <pre>
   * Controls the randomness of the output.
   * Note: The default value varies by model, see the `Model.temperature`
   * attribute of the `Model` returned the `getModel` function.
   * Values can range from [0.0,1.0],
   * inclusive. A value closer to 1.0 will produce responses that are more
   * varied and creative, while a value closer to 0.0 will typically result in
   * more straightforward responses from the model.
   * </pre>
   *
   * <code>optional float temperature = 3;</code>
   * @return The temperature.
   */
  float getTemperature();

  /**
   * <pre>
   * Number of generated responses to return.
   * This value must be between [1, 8], inclusive. If unset, this will default
   * to 1.
   * </pre>
   *
   * <code>optional int32 candidate_count = 4;</code>
   * @return Whether the candidateCount field is set.
   */
  boolean hasCandidateCount();
  /**
   * <pre>
   * Number of generated responses to return.
   * This value must be between [1, 8], inclusive. If unset, this will default
   * to 1.
   * </pre>
   *
   * <code>optional int32 candidate_count = 4;</code>
   * @return The candidateCount.
   */
  int getCandidateCount();

  /**
   * <pre>
   * The maximum number of tokens to include in a candidate.
   * If unset, this will default to 64.
   * </pre>
   *
   * <code>optional int32 max_output_tokens = 5;</code>
   * @return Whether the maxOutputTokens field is set.
   */
  boolean hasMaxOutputTokens();
  /**
   * <pre>
   * The maximum number of tokens to include in a candidate.
   * If unset, this will default to 64.
   * </pre>
   *
   * <code>optional int32 max_output_tokens = 5;</code>
   * @return The maxOutputTokens.
   */
  int getMaxOutputTokens();

  /**
   * <pre>
   * The maximum cumulative probability of tokens to consider when sampling.
   * The model uses combined Top-k and nucleus sampling.
   * Tokens are sorted based on their assigned probabilities so that only the
   * most liekly tokens are considered. Top-k sampling directly limits the
   * maximum number of tokens to consider, while Nucleus sampling limits number
   * of tokens based on the cumulative probability.
   * Note: The default value varies by model, see the `Model.top_p`
   * attribute of the `Model` returned the `getModel` function.
   * </pre>
   *
   * <code>optional float top_p = 6;</code>
   * @return Whether the topP field is set.
   */
  boolean hasTopP();
  /**
   * <pre>
   * The maximum cumulative probability of tokens to consider when sampling.
   * The model uses combined Top-k and nucleus sampling.
   * Tokens are sorted based on their assigned probabilities so that only the
   * most liekly tokens are considered. Top-k sampling directly limits the
   * maximum number of tokens to consider, while Nucleus sampling limits number
   * of tokens based on the cumulative probability.
   * Note: The default value varies by model, see the `Model.top_p`
   * attribute of the `Model` returned the `getModel` function.
   * </pre>
   *
   * <code>optional float top_p = 6;</code>
   * @return The topP.
   */
  float getTopP();

  /**
   * <pre>
   * The maximum number of tokens to consider when sampling.
   * The model uses combined Top-k and nucleus sampling.
   * Top-k sampling considers the set of `top_k` most probable tokens.
   * Defaults to 40.
   * Note: The default value varies by model, see the `Model.top_k`
   * attribute of the `Model` returned the `getModel` function.
   * </pre>
   *
   * <code>optional int32 top_k = 7;</code>
   * @return Whether the topK field is set.
   */
  boolean hasTopK();
  /**
   * <pre>
   * The maximum number of tokens to consider when sampling.
   * The model uses combined Top-k and nucleus sampling.
   * Top-k sampling considers the set of `top_k` most probable tokens.
   * Defaults to 40.
   * Note: The default value varies by model, see the `Model.top_k`
   * attribute of the `Model` returned the `getModel` function.
   * </pre>
   *
   * <code>optional int32 top_k = 7;</code>
   * @return The topK.
   */
  int getTopK();

  /**
   * <pre>
   * A list of unique `SafetySetting` instances for blocking unsafe content.
   * that will be enforced on the `GenerateTextRequest.prompt` and
   * `GenerateTextResponse.candidates`. There should not be more than one
   * setting for each `SafetyCategory` type. The API will block any prompts and
   * responses that fail to meet the thresholds set by these settings. This list
   * overrides the default settings for each `SafetyCategory` specified in the
   * safety_settings. If there is no `SafetySetting` for a given
   * `SafetyCategory` provided in the list, the API will use the default safety
   * setting for that category.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta2.SafetySetting safety_settings = 8;</code>
   */
  java.util.List<com.google.ai.generativelanguage.v1beta2.SafetySetting> 
      getSafetySettingsList();
  /**
   * <pre>
   * A list of unique `SafetySetting` instances for blocking unsafe content.
   * that will be enforced on the `GenerateTextRequest.prompt` and
   * `GenerateTextResponse.candidates`. There should not be more than one
   * setting for each `SafetyCategory` type. The API will block any prompts and
   * responses that fail to meet the thresholds set by these settings. This list
   * overrides the default settings for each `SafetyCategory` specified in the
   * safety_settings. If there is no `SafetySetting` for a given
   * `SafetyCategory` provided in the list, the API will use the default safety
   * setting for that category.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta2.SafetySetting safety_settings = 8;</code>
   */
  com.google.ai.generativelanguage.v1beta2.SafetySetting getSafetySettings(int index);
  /**
   * <pre>
   * A list of unique `SafetySetting` instances for blocking unsafe content.
   * that will be enforced on the `GenerateTextRequest.prompt` and
   * `GenerateTextResponse.candidates`. There should not be more than one
   * setting for each `SafetyCategory` type. The API will block any prompts and
   * responses that fail to meet the thresholds set by these settings. This list
   * overrides the default settings for each `SafetyCategory` specified in the
   * safety_settings. If there is no `SafetySetting` for a given
   * `SafetyCategory` provided in the list, the API will use the default safety
   * setting for that category.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta2.SafetySetting safety_settings = 8;</code>
   */
  int getSafetySettingsCount();
  /**
   * <pre>
   * A list of unique `SafetySetting` instances for blocking unsafe content.
   * that will be enforced on the `GenerateTextRequest.prompt` and
   * `GenerateTextResponse.candidates`. There should not be more than one
   * setting for each `SafetyCategory` type. The API will block any prompts and
   * responses that fail to meet the thresholds set by these settings. This list
   * overrides the default settings for each `SafetyCategory` specified in the
   * safety_settings. If there is no `SafetySetting` for a given
   * `SafetyCategory` provided in the list, the API will use the default safety
   * setting for that category.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta2.SafetySetting safety_settings = 8;</code>
   */
  java.util.List<? extends com.google.ai.generativelanguage.v1beta2.SafetySettingOrBuilder> 
      getSafetySettingsOrBuilderList();
  /**
   * <pre>
   * A list of unique `SafetySetting` instances for blocking unsafe content.
   * that will be enforced on the `GenerateTextRequest.prompt` and
   * `GenerateTextResponse.candidates`. There should not be more than one
   * setting for each `SafetyCategory` type. The API will block any prompts and
   * responses that fail to meet the thresholds set by these settings. This list
   * overrides the default settings for each `SafetyCategory` specified in the
   * safety_settings. If there is no `SafetySetting` for a given
   * `SafetyCategory` provided in the list, the API will use the default safety
   * setting for that category.
   * </pre>
   *
   * <code>repeated .google.ai.generativelanguage.v1beta2.SafetySetting safety_settings = 8;</code>
   */
  com.google.ai.generativelanguage.v1beta2.SafetySettingOrBuilder getSafetySettingsOrBuilder(
      int index);

  /**
   * <pre>
   * The set of character sequences (up to 5) that will stop output generation.
   * If specified, the API will stop at the first appearance of a stop
   * sequence. The stop sequence will not be included as part of the response.
   * </pre>
   *
   * <code>repeated string stop_sequences = 9;</code>
   * @return A list containing the stopSequences.
   */
  java.util.List<java.lang.String>
      getStopSequencesList();
  /**
   * <pre>
   * The set of character sequences (up to 5) that will stop output generation.
   * If specified, the API will stop at the first appearance of a stop
   * sequence. The stop sequence will not be included as part of the response.
   * </pre>
   *
   * <code>repeated string stop_sequences = 9;</code>
   * @return The count of stopSequences.
   */
  int getStopSequencesCount();
  /**
   * <pre>
   * The set of character sequences (up to 5) that will stop output generation.
   * If specified, the API will stop at the first appearance of a stop
   * sequence. The stop sequence will not be included as part of the response.
   * </pre>
   *
   * <code>repeated string stop_sequences = 9;</code>
   * @param index The index of the element to return.
   * @return The stopSequences at the given index.
   */
  java.lang.String getStopSequences(int index);
  /**
   * <pre>
   * The set of character sequences (up to 5) that will stop output generation.
   * If specified, the API will stop at the first appearance of a stop
   * sequence. The stop sequence will not be included as part of the response.
   * </pre>
   *
   * <code>repeated string stop_sequences = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the stopSequences at the given index.
   */
  com.google.protobuf.ByteString
      getStopSequencesBytes(int index);
}