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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.rollover.RolloverConditions;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.rollover.Request
@JsonpDeserializable
public final class RolloverRequest extends RequestBase implements JsonpSerializable {
	private final String alias;

	@Nullable
	private final Map<String, Alias> aliases;

	@Nullable
	private final RolloverConditions conditions;

	@Nullable
	private final Boolean dryRun;

	@Nullable
	private final Boolean includeTypeName;

	@Nullable
	private final JsonValue /*
							 * Union(Dictionary<internal.string, _types.mapping.TypeMapping> (singleKey =
							 * false) | _types.mapping.TypeMapping)
							 */ mappings;

	@Nullable
	private final String masterTimeout;

	@Nullable
	private final String newIndex;

	@Nullable
	private final Map<String, JsonData> settings;

	@Nullable
	private final String timeout;

	@Nullable
	private final JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

	// ---------------------------------------------------------------------------------------------

	public RolloverRequest(Builder builder) {

		this.alias = Objects.requireNonNull(builder.alias, "alias");
		this.aliases = ModelTypeHelper.unmodifiable(builder.aliases);
		this.conditions = builder.conditions;
		this.dryRun = builder.dryRun;
		this.includeTypeName = builder.includeTypeName;
		this.mappings = builder.mappings;
		this.masterTimeout = builder.masterTimeout;
		this.newIndex = builder.newIndex;
		this.settings = ModelTypeHelper.unmodifiable(builder.settings);
		this.timeout = builder.timeout;
		this.waitForActiveShards = builder.waitForActiveShards;

	}

	public RolloverRequest(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - The name of the alias to rollover
	 * <p>
	 * API name: {@code alias}
	 */
	public String alias() {
		return this.alias;
	}

	/**
	 * API name: {@code aliases}
	 */
	@Nullable
	public Map<String, Alias> aliases() {
		return this.aliases;
	}

	/**
	 * API name: {@code conditions}
	 */
	@Nullable
	public RolloverConditions conditions() {
		return this.conditions;
	}

	/**
	 * If set to true the rollover action will only be validated but not actually
	 * performed even if a condition matches. The default is false
	 * <p>
	 * API name: {@code dry_run}
	 */
	@Nullable
	public Boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * API name: {@code include_type_name}
	 */
	@Nullable
	public Boolean includeTypeName() {
		return this.includeTypeName;
	}

	/**
	 * API name: {@code mappings}
	 */
	@Nullable
	public JsonValue /*
						 * Union(Dictionary<internal.string, _types.mapping.TypeMapping> (singleKey =
						 * false) | _types.mapping.TypeMapping)
						 */ mappings() {
		return this.mappings;
	}

	/**
	 * Specify timeout for connection to master
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public String masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * The name of the rollover index
	 * <p>
	 * API name: {@code new_index}
	 */
	@Nullable
	public String newIndex() {
		return this.newIndex;
	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
	}

	/**
	 * Set the number of active shards to wait for on the newly created rollover
	 * index before the operation returns.
	 * <p>
	 * API name: {@code wait_for_active_shards}
	 */
	@Nullable
	public JsonValue /* _types.WaitForActiveShards */ waitForActiveShards() {
		return this.waitForActiveShards;
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

		if (this.aliases != null) {

			generator.writeKey("aliases");
			generator.writeStartObject();
			for (Map.Entry<String, Alias> item0 : this.aliases.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.conditions != null) {

			generator.writeKey("conditions");
			this.conditions.serialize(generator, mapper);

		}
		if (this.mappings != null) {

			generator.writeKey("mappings");
			generator.write(this.mappings);

		}
		if (this.settings != null) {

			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolloverRequest}.
	 */
	public static class Builder implements ObjectBuilder<RolloverRequest> {
		private String alias;

		@Nullable
		private Map<String, Alias> aliases;

		@Nullable
		private RolloverConditions conditions;

		@Nullable
		private Boolean dryRun;

		@Nullable
		private Boolean includeTypeName;

		@Nullable
		private JsonValue /*
							 * Union(Dictionary<internal.string, _types.mapping.TypeMapping> (singleKey =
							 * false) | _types.mapping.TypeMapping)
							 */ mappings;

		@Nullable
		private String masterTimeout;

		@Nullable
		private String newIndex;

		@Nullable
		private Map<String, JsonData> settings;

		@Nullable
		private String timeout;

		@Nullable
		private JsonValue /* _types.WaitForActiveShards */ waitForActiveShards;

		/**
		 * Required - The name of the alias to rollover
		 * <p>
		 * API name: {@code alias}
		 */
		public Builder alias(String value) {
			this.alias = value;
			return this;
		}

		/**
		 * API name: {@code aliases}
		 */
		public Builder aliases(@Nullable Map<String, Alias> value) {
			this.aliases = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Alias value) {
			if (this.aliases == null) {
				this.aliases = new HashMap<>();
			}
			this.aliases.put(key, value);
			return this;
		}

		/**
		 * Set {@link #aliases(Map)} to a singleton map.
		 */
		public Builder aliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.aliases(Collections.singletonMap(key, fn.apply(new Alias.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #aliases(Map)}, creating the map if needed.
		 */
		public Builder putAliases(String key, Function<Alias.Builder, ObjectBuilder<Alias>> fn) {
			return this.putAliases(key, fn.apply(new Alias.Builder()).build());
		}

		/**
		 * API name: {@code conditions}
		 */
		public Builder conditions(@Nullable RolloverConditions value) {
			this.conditions = value;
			return this;
		}

		/**
		 * API name: {@code conditions}
		 */
		public Builder conditions(Function<RolloverConditions.Builder, ObjectBuilder<RolloverConditions>> fn) {
			return this.conditions(fn.apply(new RolloverConditions.Builder()).build());
		}

		/**
		 * If set to true the rollover action will only be validated but not actually
		 * performed even if a condition matches. The default is false
		 * <p>
		 * API name: {@code dry_run}
		 */
		public Builder dryRun(@Nullable Boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * API name: {@code include_type_name}
		 */
		public Builder includeTypeName(@Nullable Boolean value) {
			this.includeTypeName = value;
			return this;
		}

		/**
		 * API name: {@code mappings}
		 */
		public Builder mappings(@Nullable JsonValue /*
													 * Union(Dictionary<internal.string, _types.mapping.TypeMapping>
													 * (singleKey = false) | _types.mapping.TypeMapping)
													 */ value) {
			this.mappings = value;
			return this;
		}

		/**
		 * Specify timeout for connection to master
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public Builder masterTimeout(@Nullable String value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * The name of the rollover index
		 * <p>
		 * API name: {@code new_index}
		 */
		public Builder newIndex(@Nullable String value) {
			this.newIndex = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable Map<String, JsonData> value) {
			this.settings = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #settings(Map)}, creating the map if needed.
		 */
		public Builder putSettings(String key, JsonData value) {
			if (this.settings == null) {
				this.settings = new HashMap<>();
			}
			this.settings.put(key, value);
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Set the number of active shards to wait for on the newly created rollover
		 * index before the operation returns.
		 * <p>
		 * API name: {@code wait_for_active_shards}
		 */
		public Builder waitForActiveShards(@Nullable JsonValue /* _types.WaitForActiveShards */ value) {
			this.waitForActiveShards = value;
			return this;
		}

		/**
		 * Builds a {@link RolloverRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverRequest build() {

			return new RolloverRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolloverRequest}
	 */
	public static final JsonpDeserializer<RolloverRequest> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RolloverRequest::setupRolloverRequestDeserializer, Builder::build);

	protected static void setupRolloverRequestDeserializer(DelegatingDeserializer<RolloverRequest.Builder> op) {

		op.add(Builder::aliases, JsonpDeserializer.stringMapDeserializer(Alias._DESERIALIZER), "aliases");
		op.add(Builder::conditions, RolloverConditions._DESERIALIZER, "conditions");
		op.add(Builder::mappings, JsonpDeserializer.jsonValueDeserializer(), "mappings");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.rollover}".
	 */
	public static final Endpoint<RolloverRequest, RolloverResponse, ErrorResponse> ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				final int _newIndex = 1 << 0;
				final int _alias = 1 << 1;

				int propsSet = 0;

				if (request.newIndex() != null)
					propsSet |= _newIndex;
				propsSet |= _alias;

				if (propsSet == (_alias)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.alias, buf);
					buf.append("/_rollover");
					return buf.toString();
				}
				if (propsSet == (_alias | _newIndex)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/");
					SimpleEndpoint.pathEncode(request.alias, buf);
					buf.append("/_rollover");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.newIndex, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout);
				}
				if (request.includeTypeName != null) {
					params.put("include_type_name", String.valueOf(request.includeTypeName));
				}
				if (request.waitForActiveShards != null) {
					params.put("wait_for_active_shards", JsonpUtils.toString(request.waitForActiveShards));
				}
				if (request.dryRun != null) {
					params.put("dry_run", String.valueOf(request.dryRun));
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout);
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, RolloverResponse._DESERIALIZER);
}
