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

package co.elastic.clients.elasticsearch._types.mapping;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.mapping.FieldAliasProperty
@JsonpDeserializable
public final class FieldAliasProperty extends PropertyBase implements PropertyVariant {
	@Nullable
	private final String path;

	// ---------------------------------------------------------------------------------------------

	public FieldAliasProperty(Builder builder) {
		super(builder);

		this.path = builder.path;

	}

	public FieldAliasProperty(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Property} variant type
	 */
	@Override
	public String _variantType() {
		return "alias";
	}

	/**
	 * API name: {@code path}
	 */
	@Nullable
	public String path() {
		return this.path;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "alias");
		super.serializeInternal(generator, mapper);
		if (this.path != null) {

			generator.writeKey("path");
			generator.write(this.path);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldAliasProperty}.
	 */
	public static class Builder extends PropertyBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FieldAliasProperty> {
		@Nullable
		private String path;

		/**
		 * API name: {@code path}
		 */
		public Builder path(@Nullable String value) {
			this.path = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldAliasProperty}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldAliasProperty build() {

			return new FieldAliasProperty(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldAliasProperty}
	 */
	public static final JsonpDeserializer<FieldAliasProperty> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FieldAliasProperty::setupFieldAliasPropertyDeserializer, Builder::build);

	protected static void setupFieldAliasPropertyDeserializer(DelegatingDeserializer<FieldAliasProperty.Builder> op) {
		PropertyBase.setupPropertyBaseDeserializer(op);
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");

		op.ignore("type");
	}

}
