/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.Detector
@JsonpDeserializable
public final class Detector implements JsonpSerializable {
	@Nullable
	private final String byFieldName;

	@Nullable
	private final List<DetectionRule> customRules;

	@Nullable
	private final String detectorDescription;

	@Nullable
	private final Integer detectorIndex;

	@Nullable
	private final ExcludeFrequent excludeFrequent;

	@Nullable
	private final String fieldName;

	private final String function;

	@Nullable
	private final String overFieldName;

	@Nullable
	private final String partitionFieldName;

	@Nullable
	private final Boolean useNull;

	// ---------------------------------------------------------------------------------------------

	public Detector(Builder builder) {

		this.byFieldName = builder.byFieldName;
		this.customRules = ModelTypeHelper.unmodifiable(builder.customRules);
		this.detectorDescription = builder.detectorDescription;
		this.detectorIndex = builder.detectorIndex;
		this.excludeFrequent = builder.excludeFrequent;
		this.fieldName = builder.fieldName;
		this.function = Objects.requireNonNull(builder.function, "function");
		this.overFieldName = builder.overFieldName;
		this.partitionFieldName = builder.partitionFieldName;
		this.useNull = builder.useNull;

	}

	public Detector(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * The field used to split the data. In particular, this property is used for
	 * analyzing the splits with respect to their own history. It is used for
	 * finding unusual values in the context of the split.
	 * <p>
	 * API name: {@code by_field_name}
	 */
	@Nullable
	public String byFieldName() {
		return this.byFieldName;
	}

	/**
	 * Custom rules enable you to customize the way detectors operate. For example,
	 * a rule may dictate conditions under which results should be skipped. Kibana
	 * refers to custom rules as job rules.
	 * <p>
	 * API name: {@code custom_rules}
	 */
	@Nullable
	public List<DetectionRule> customRules() {
		return this.customRules;
	}

	/**
	 * A description of the detector.
	 * <p>
	 * API name: {@code detector_description}
	 */
	@Nullable
	public String detectorDescription() {
		return this.detectorDescription;
	}

	/**
	 * A unique identifier for the detector. This identifier is based on the order
	 * of the detectors in the <code>analysis_config</code>, starting at zero. If
	 * you specify a value for this property, it is ignored.
	 * <p>
	 * API name: {@code detector_index}
	 */
	@Nullable
	public Integer detectorIndex() {
		return this.detectorIndex;
	}

	/**
	 * If set, frequent entities are excluded from influencing the anomaly results.
	 * Entities can be considered frequent over time or frequent in a population. If
	 * you are working with both over and by fields, you can set
	 * <code>exclude_frequent</code> to <code>all</code> for both fields, or to
	 * <code>by</code> or <code>over</code> for those specific fields.
	 * <p>
	 * API name: {@code exclude_frequent}
	 */
	@Nullable
	public ExcludeFrequent excludeFrequent() {
		return this.excludeFrequent;
	}

	/**
	 * The field that the detector uses in the function. If you use an event rate
	 * function such as count or rare, do not specify this field. The
	 * <code>field_name</code> cannot contain double quotes or backslashes.
	 * <p>
	 * API name: {@code field_name}
	 */
	@Nullable
	public String fieldName() {
		return this.fieldName;
	}

	/**
	 * Required - The analysis function that is used. For example,
	 * <code>count</code>, <code>rare</code>, <code>mean</code>, <code>min</code>,
	 * <code>max</code>, or <code>sum</code>.
	 * <p>
	 * API name: {@code function}
	 */
	public String function() {
		return this.function;
	}

	/**
	 * The field used to split the data. In particular, this property is used for
	 * analyzing the splits with respect to the history of all splits. It is used
	 * for finding unusual values in the population of all splits.
	 * <p>
	 * API name: {@code over_field_name}
	 */
	@Nullable
	public String overFieldName() {
		return this.overFieldName;
	}

	/**
	 * The field used to segment the analysis. When you use this property, you have
	 * completely independent baselines for each value of this field.
	 * <p>
	 * API name: {@code partition_field_name}
	 */
	@Nullable
	public String partitionFieldName() {
		return this.partitionFieldName;
	}

	/**
	 * Defines whether a new series is used as the null series when there is no
	 * value for the by or partition fields.
	 * <p>
	 * API name: {@code use_null}
	 */
	@Nullable
	public Boolean useNull() {
		return this.useNull;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.byFieldName != null) {

			generator.writeKey("by_field_name");
			generator.write(this.byFieldName);

		}
		if (this.customRules != null) {

			generator.writeKey("custom_rules");
			generator.writeStartArray();
			for (DetectionRule item0 : this.customRules) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.detectorDescription != null) {

			generator.writeKey("detector_description");
			generator.write(this.detectorDescription);

		}
		if (this.detectorIndex != null) {

			generator.writeKey("detector_index");
			generator.write(this.detectorIndex);

		}
		if (this.excludeFrequent != null) {

			generator.writeKey("exclude_frequent");
			this.excludeFrequent.serialize(generator, mapper);
		}
		if (this.fieldName != null) {

			generator.writeKey("field_name");
			generator.write(this.fieldName);

		}

		generator.writeKey("function");
		generator.write(this.function);

		if (this.overFieldName != null) {

			generator.writeKey("over_field_name");
			generator.write(this.overFieldName);

		}
		if (this.partitionFieldName != null) {

			generator.writeKey("partition_field_name");
			generator.write(this.partitionFieldName);

		}
		if (this.useNull != null) {

			generator.writeKey("use_null");
			generator.write(this.useNull);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Detector}.
	 */
	public static class Builder implements ObjectBuilder<Detector> {
		@Nullable
		private String byFieldName;

		@Nullable
		private List<DetectionRule> customRules;

		@Nullable
		private String detectorDescription;

		@Nullable
		private Integer detectorIndex;

		@Nullable
		private ExcludeFrequent excludeFrequent;

		@Nullable
		private String fieldName;

		private String function;

		@Nullable
		private String overFieldName;

		@Nullable
		private String partitionFieldName;

		@Nullable
		private Boolean useNull;

		/**
		 * The field used to split the data. In particular, this property is used for
		 * analyzing the splits with respect to their own history. It is used for
		 * finding unusual values in the context of the split.
		 * <p>
		 * API name: {@code by_field_name}
		 */
		public Builder byFieldName(@Nullable String value) {
			this.byFieldName = value;
			return this;
		}

		/**
		 * Custom rules enable you to customize the way detectors operate. For example,
		 * a rule may dictate conditions under which results should be skipped. Kibana
		 * refers to custom rules as job rules.
		 * <p>
		 * API name: {@code custom_rules}
		 */
		public Builder customRules(@Nullable List<DetectionRule> value) {
			this.customRules = value;
			return this;
		}

		/**
		 * Custom rules enable you to customize the way detectors operate. For example,
		 * a rule may dictate conditions under which results should be skipped. Kibana
		 * refers to custom rules as job rules.
		 * <p>
		 * API name: {@code custom_rules}
		 */
		public Builder customRules(DetectionRule... value) {
			this.customRules = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #customRules(List)}, creating the list if needed.
		 */
		public Builder addCustomRules(DetectionRule value) {
			if (this.customRules == null) {
				this.customRules = new ArrayList<>();
			}
			this.customRules.add(value);
			return this;
		}

		/**
		 * Set {@link #customRules(List)} to a singleton list.
		 */
		public Builder customRules(Function<DetectionRule.Builder, ObjectBuilder<DetectionRule>> fn) {
			return this.customRules(fn.apply(new DetectionRule.Builder()).build());
		}

		/**
		 * Add a value to {@link #customRules(List)}, creating the list if needed.
		 */
		public Builder addCustomRules(Function<DetectionRule.Builder, ObjectBuilder<DetectionRule>> fn) {
			return this.addCustomRules(fn.apply(new DetectionRule.Builder()).build());
		}

		/**
		 * A description of the detector.
		 * <p>
		 * API name: {@code detector_description}
		 */
		public Builder detectorDescription(@Nullable String value) {
			this.detectorDescription = value;
			return this;
		}

		/**
		 * A unique identifier for the detector. This identifier is based on the order
		 * of the detectors in the <code>analysis_config</code>, starting at zero. If
		 * you specify a value for this property, it is ignored.
		 * <p>
		 * API name: {@code detector_index}
		 */
		public Builder detectorIndex(@Nullable Integer value) {
			this.detectorIndex = value;
			return this;
		}

		/**
		 * If set, frequent entities are excluded from influencing the anomaly results.
		 * Entities can be considered frequent over time or frequent in a population. If
		 * you are working with both over and by fields, you can set
		 * <code>exclude_frequent</code> to <code>all</code> for both fields, or to
		 * <code>by</code> or <code>over</code> for those specific fields.
		 * <p>
		 * API name: {@code exclude_frequent}
		 */
		public Builder excludeFrequent(@Nullable ExcludeFrequent value) {
			this.excludeFrequent = value;
			return this;
		}

		/**
		 * The field that the detector uses in the function. If you use an event rate
		 * function such as count or rare, do not specify this field. The
		 * <code>field_name</code> cannot contain double quotes or backslashes.
		 * <p>
		 * API name: {@code field_name}
		 */
		public Builder fieldName(@Nullable String value) {
			this.fieldName = value;
			return this;
		}

		/**
		 * Required - The analysis function that is used. For example,
		 * <code>count</code>, <code>rare</code>, <code>mean</code>, <code>min</code>,
		 * <code>max</code>, or <code>sum</code>.
		 * <p>
		 * API name: {@code function}
		 */
		public Builder function(String value) {
			this.function = value;
			return this;
		}

		/**
		 * The field used to split the data. In particular, this property is used for
		 * analyzing the splits with respect to the history of all splits. It is used
		 * for finding unusual values in the population of all splits.
		 * <p>
		 * API name: {@code over_field_name}
		 */
		public Builder overFieldName(@Nullable String value) {
			this.overFieldName = value;
			return this;
		}

		/**
		 * The field used to segment the analysis. When you use this property, you have
		 * completely independent baselines for each value of this field.
		 * <p>
		 * API name: {@code partition_field_name}
		 */
		public Builder partitionFieldName(@Nullable String value) {
			this.partitionFieldName = value;
			return this;
		}

		/**
		 * Defines whether a new series is used as the null series when there is no
		 * value for the by or partition fields.
		 * <p>
		 * API name: {@code use_null}
		 */
		public Builder useNull(@Nullable Boolean value) {
			this.useNull = value;
			return this;
		}

		/**
		 * Builds a {@link Detector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Detector build() {

			return new Detector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Detector}
	 */
	public static final JsonpDeserializer<Detector> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Detector::setupDetectorDeserializer, Builder::build);

	protected static void setupDetectorDeserializer(DelegatingDeserializer<Detector.Builder> op) {

		op.add(Builder::byFieldName, JsonpDeserializer.stringDeserializer(), "by_field_name");
		op.add(Builder::customRules, JsonpDeserializer.arrayDeserializer(DetectionRule._DESERIALIZER), "custom_rules");
		op.add(Builder::detectorDescription, JsonpDeserializer.stringDeserializer(), "detector_description");
		op.add(Builder::detectorIndex, JsonpDeserializer.integerDeserializer(), "detector_index");
		op.add(Builder::excludeFrequent, ExcludeFrequent._DESERIALIZER, "exclude_frequent");
		op.add(Builder::fieldName, JsonpDeserializer.stringDeserializer(), "field_name");
		op.add(Builder::function, JsonpDeserializer.stringDeserializer(), "function");
		op.add(Builder::overFieldName, JsonpDeserializer.stringDeserializer(), "over_field_name");
		op.add(Builder::partitionFieldName, JsonpDeserializer.stringDeserializer(), "partition_field_name");
		op.add(Builder::useNull, JsonpDeserializer.booleanDeserializer(), "use_null");

	}

}
