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

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.core.reindex.Destination;
import co.elastic.clients.elasticsearch.core.reindex.Source;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: transform.put_transform.Request
@JsonpDeserializable
public final class PutTransformRequest extends RequestBase implements JsonpSerializable {
	@Nullable
	private final Boolean deferValidation;

	@Nullable
	private final String description;

	private final Destination dest;

	@Nullable
	private final String frequency;

	@Nullable
	private final Latest latest;

	@Nullable
	private final Pivot pivot;

	@Nullable
	private final RetentionPolicy retentionPolicy;

	@Nullable
	private final Settings settings;

	private final Source source;

	@Nullable
	private final Sync sync;

	private final String transformId;

	// ---------------------------------------------------------------------------------------------

	public PutTransformRequest(Builder builder) {

		this.deferValidation = builder.deferValidation;
		this.description = builder.description;
		this.dest = Objects.requireNonNull(builder.dest, "dest");
		this.frequency = builder.frequency;
		this.latest = builder.latest;
		this.pivot = builder.pivot;
		this.retentionPolicy = builder.retentionPolicy;
		this.settings = builder.settings;
		this.source = Objects.requireNonNull(builder.source, "source");
		this.sync = builder.sync;
		this.transformId = Objects.requireNonNull(builder.transformId, "transform_id");

	}

	public PutTransformRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * When true, deferrable validations are not run. This behavior may be desired
	 * if the source index does not exist until after the transform is created.
	 * <p>
	 * API name: {@code defer_validation}
	 */
	@Nullable
	public Boolean deferValidation() {
		return this.deferValidation;
	}

	/**
	 * Free text description of the transform.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * Required - The destination for the transform.
	 * <p>
	 * API name: {@code dest}
	 */
	public Destination dest() {
		return this.dest;
	}

	/**
	 * The interval between checks for changes in the source indices when the
	 * transform is running continuously. Also determines the retry interval in the
	 * event of transient failures while the transform is searching or indexing. The
	 * minimum value is 1s and the maximum is 1h.
	 * <p>
	 * API name: {@code frequency}
	 */
	@Nullable
	public String frequency() {
		return this.frequency;
	}

	/**
	 * The latest method transforms the data by finding the latest document for each
	 * unique key.
	 * <p>
	 * API name: {@code latest}
	 */
	@Nullable
	public Latest latest() {
		return this.latest;
	}

	/**
	 * The pivot method transforms the data by aggregating and grouping it. These
	 * objects define the group by fields and the aggregation to reduce the data.
	 * <p>
	 * API name: {@code pivot}
	 */
	@Nullable
	public Pivot pivot() {
		return this.pivot;
	}

	/**
	 * Defines a retention policy for the transform. Data that meets the defined
	 * criteria is deleted from the destination index.
	 * <p>
	 * API name: {@code retention_policy}
	 */
	@Nullable
	public RetentionPolicy retentionPolicy() {
		return this.retentionPolicy;
	}

	/**
	 * Defines optional transform settings.
	 * <p>
	 * API name: {@code settings}
	 */
	@Nullable
	public Settings settings() {
		return this.settings;
	}

	/**
	 * Required - The source of the data for the transform.
	 * <p>
	 * API name: {@code source}
	 */
	public Source source() {
		return this.source;
	}

	/**
	 * Defines the properties transforms require to run continuously.
	 * <p>
	 * API name: {@code sync}
	 */
	@Nullable
	public Sync sync() {
		return this.sync;
	}

	/**
	 * Required - Identifier for the transform. This identifier can contain
	 * lowercase alphanumeric characters (a-z and 0-9), hyphens, and underscores. It
	 * must start and end with alphanumeric characters.
	 * <p>
	 * API name: {@code transform_id}
	 */
	public String transformId() {
		return this.transformId;
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

		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}

		generator.writeKey("dest");
		this.dest.serialize(generator, mapper);

		if (this.frequency != null) {

			generator.writeKey("frequency");
			generator.write(this.frequency);

		}
		if (this.latest != null) {

			generator.writeKey("latest");
			this.latest.serialize(generator, mapper);

		}
		if (this.pivot != null) {

			generator.writeKey("pivot");
			this.pivot.serialize(generator, mapper);

		}
		if (this.retentionPolicy != null) {

			generator.writeKey("retention_policy");
			this.retentionPolicy.serialize(generator, mapper);

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			this.settings.serialize(generator, mapper);

		}

		generator.writeKey("source");
		this.source.serialize(generator, mapper);

		if (this.sync != null) {

			generator.writeKey("sync");
			this.sync.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutTransformRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutTransformRequest> {
		@Nullable
		private Boolean deferValidation;

		@Nullable
		private String description;

		private Destination dest;

		@Nullable
		private String frequency;

		@Nullable
		private Latest latest;

		@Nullable
		private Pivot pivot;

		@Nullable
		private RetentionPolicy retentionPolicy;

		@Nullable
		private Settings settings;

		private Source source;

		@Nullable
		private Sync sync;

		private String transformId;

		/**
		 * When true, deferrable validations are not run. This behavior may be desired
		 * if the source index does not exist until after the transform is created.
		 * <p>
		 * API name: {@code defer_validation}
		 */
		public Builder deferValidation(@Nullable Boolean value) {
			this.deferValidation = value;
			return this;
		}

		/**
		 * Free text description of the transform.
		 * <p>
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - The destination for the transform.
		 * <p>
		 * API name: {@code dest}
		 */
		public Builder dest(Destination value) {
			this.dest = value;
			return this;
		}

		/**
		 * Required - The destination for the transform.
		 * <p>
		 * API name: {@code dest}
		 */
		public Builder dest(Function<Destination.Builder, ObjectBuilder<Destination>> fn) {
			return this.dest(fn.apply(new Destination.Builder()).build());
		}

		/**
		 * The interval between checks for changes in the source indices when the
		 * transform is running continuously. Also determines the retry interval in the
		 * event of transient failures while the transform is searching or indexing. The
		 * minimum value is 1s and the maximum is 1h.
		 * <p>
		 * API name: {@code frequency}
		 */
		public Builder frequency(@Nullable String value) {
			this.frequency = value;
			return this;
		}

		/**
		 * The latest method transforms the data by finding the latest document for each
		 * unique key.
		 * <p>
		 * API name: {@code latest}
		 */
		public Builder latest(@Nullable Latest value) {
			this.latest = value;
			return this;
		}

		/**
		 * The latest method transforms the data by finding the latest document for each
		 * unique key.
		 * <p>
		 * API name: {@code latest}
		 */
		public Builder latest(Function<Latest.Builder, ObjectBuilder<Latest>> fn) {
			return this.latest(fn.apply(new Latest.Builder()).build());
		}

		/**
		 * The pivot method transforms the data by aggregating and grouping it. These
		 * objects define the group by fields and the aggregation to reduce the data.
		 * <p>
		 * API name: {@code pivot}
		 */
		public Builder pivot(@Nullable Pivot value) {
			this.pivot = value;
			return this;
		}

		/**
		 * The pivot method transforms the data by aggregating and grouping it. These
		 * objects define the group by fields and the aggregation to reduce the data.
		 * <p>
		 * API name: {@code pivot}
		 */
		public Builder pivot(Function<Pivot.Builder, ObjectBuilder<Pivot>> fn) {
			return this.pivot(fn.apply(new Pivot.Builder()).build());
		}

		/**
		 * Defines a retention policy for the transform. Data that meets the defined
		 * criteria is deleted from the destination index.
		 * <p>
		 * API name: {@code retention_policy}
		 */
		public Builder retentionPolicy(@Nullable RetentionPolicy value) {
			this.retentionPolicy = value;
			return this;
		}

		/**
		 * Defines a retention policy for the transform. Data that meets the defined
		 * criteria is deleted from the destination index.
		 * <p>
		 * API name: {@code retention_policy}
		 */
		public Builder retentionPolicy(Function<RetentionPolicy.Builder, ObjectBuilder<RetentionPolicy>> fn) {
			return this.retentionPolicy(fn.apply(new RetentionPolicy.Builder()).build());
		}

		/**
		 * Defines optional transform settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable Settings value) {
			this.settings = value;
			return this;
		}

		/**
		 * Defines optional transform settings.
		 * <p>
		 * API name: {@code settings}
		 */
		public Builder settings(Function<Settings.Builder, ObjectBuilder<Settings>> fn) {
			return this.settings(fn.apply(new Settings.Builder()).build());
		}

		/**
		 * Required - The source of the data for the transform.
		 * <p>
		 * API name: {@code source}
		 */
		public Builder source(Source value) {
			this.source = value;
			return this;
		}

		/**
		 * Required - The source of the data for the transform.
		 * <p>
		 * API name: {@code source}
		 */
		public Builder source(Function<Source.Builder, ObjectBuilder<Source>> fn) {
			return this.source(fn.apply(new Source.Builder()).build());
		}

		/**
		 * Defines the properties transforms require to run continuously.
		 * <p>
		 * API name: {@code sync}
		 */
		public Builder sync(@Nullable Sync value) {
			this.sync = value;
			return this;
		}

		/**
		 * Defines the properties transforms require to run continuously.
		 * <p>
		 * API name: {@code sync}
		 */
		public Builder sync(Function<Sync.Builder, ObjectBuilder<Sync>> fn) {
			return this.sync(fn.apply(new Sync.Builder()).build());
		}

		/**
		 * Required - Identifier for the transform. This identifier can contain
		 * lowercase alphanumeric characters (a-z and 0-9), hyphens, and underscores. It
		 * must start and end with alphanumeric characters.
		 * <p>
		 * API name: {@code transform_id}
		 */
		public Builder transformId(String value) {
			this.transformId = value;
			return this;
		}

		/**
		 * Builds a {@link PutTransformRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutTransformRequest build() {

			return new PutTransformRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutTransformRequest}
	 */
	public static final JsonpDeserializer<PutTransformRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutTransformRequest::setupPutTransformRequestDeserializer, Builder::build);

	protected static void setupPutTransformRequestDeserializer(DelegatingDeserializer<PutTransformRequest.Builder> op) {

		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::dest, Destination._DESERIALIZER, "dest");
		op.add(Builder::frequency, JsonpDeserializer.stringDeserializer(), "frequency");
		op.add(Builder::latest, Latest._DESERIALIZER, "latest");
		op.add(Builder::pivot, Pivot._DESERIALIZER, "pivot");
		op.add(Builder::retentionPolicy, RetentionPolicy._DESERIALIZER, "retention_policy");
		op.add(Builder::settings, Settings._DESERIALIZER, "settings");
		op.add(Builder::source, Source._DESERIALIZER, "source");
		op.add(Builder::sync, Sync._DESERIALIZER, "sync");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code transform.put_transform}".
	 */
	public static final Endpoint<PutTransformRequest, PutTransformResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _transformId = 1 << 0;

				int propsSet = 0;

				propsSet |= _transformId;

				if (propsSet == (_transformId)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_transform");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.transformId, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.deferValidation != null) {
					params.put("defer_validation", String.valueOf(request.deferValidation));
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutTransformResponse._DESERIALIZER);
}
