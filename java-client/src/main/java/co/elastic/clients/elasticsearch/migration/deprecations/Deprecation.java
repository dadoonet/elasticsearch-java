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

package co.elastic.clients.elasticsearch.migration.deprecations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: migration.deprecations.Deprecation
@JsonpDeserializable
public final class Deprecation implements JsonpSerializable {
	private final String details;

	private final DeprecationLevel level;

	private final String message;

	private final String url;

	// ---------------------------------------------------------------------------------------------

	public Deprecation(Builder builder) {

		this.details = Objects.requireNonNull(builder.details, "details");
		this.level = Objects.requireNonNull(builder.level, "level");
		this.message = Objects.requireNonNull(builder.message, "message");
		this.url = Objects.requireNonNull(builder.url, "url");

	}

	public Deprecation(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code details}
	 */
	public String details() {
		return this.details;
	}

	/**
	 * Required - The level property describes the significance of the issue.
	 * <p>
	 * API name: {@code level}
	 */
	public DeprecationLevel level() {
		return this.level;
	}

	/**
	 * Required - API name: {@code message}
	 */
	public String message() {
		return this.message;
	}

	/**
	 * Required - API name: {@code url}
	 */
	public String url() {
		return this.url;
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

		generator.writeKey("details");
		generator.write(this.details);

		generator.writeKey("level");
		this.level.serialize(generator, mapper);

		generator.writeKey("message");
		generator.write(this.message);

		generator.writeKey("url");
		generator.write(this.url);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Deprecation}.
	 */
	public static class Builder implements ObjectBuilder<Deprecation> {
		private String details;

		private DeprecationLevel level;

		private String message;

		private String url;

		/**
		 * Required - API name: {@code details}
		 */
		public Builder details(String value) {
			this.details = value;
			return this;
		}

		/**
		 * Required - The level property describes the significance of the issue.
		 * <p>
		 * API name: {@code level}
		 */
		public Builder level(DeprecationLevel value) {
			this.level = value;
			return this;
		}

		/**
		 * Required - API name: {@code message}
		 */
		public Builder message(String value) {
			this.message = value;
			return this;
		}

		/**
		 * Required - API name: {@code url}
		 */
		public Builder url(String value) {
			this.url = value;
			return this;
		}

		/**
		 * Builds a {@link Deprecation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Deprecation build() {

			return new Deprecation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Deprecation}
	 */
	public static final JsonpDeserializer<Deprecation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Deprecation::setupDeprecationDeserializer, Builder::build);

	protected static void setupDeprecationDeserializer(DelegatingDeserializer<Deprecation.Builder> op) {

		op.add(Builder::details, JsonpDeserializer.stringDeserializer(), "details");
		op.add(Builder::level, DeprecationLevel._DESERIALIZER, "level");
		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");
		op.add(Builder::url, JsonpDeserializer.stringDeserializer(), "url");

	}

}
