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

package co.elastic.clients.elasticsearch.core.termvectors;

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
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.termvectors.TermVector
@JsonpDeserializable
public final class TermVector implements JsonpSerializable {
	private final FieldStatistics fieldStatistics;

	private final Map<String, Term> terms;

	// ---------------------------------------------------------------------------------------------

	public TermVector(Builder builder) {

		this.fieldStatistics = Objects.requireNonNull(builder.fieldStatistics, "field_statistics");
		this.terms = ModelTypeHelper.unmodifiableNonNull(builder.terms, "terms");

	}

	public TermVector(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code field_statistics}
	 */
	public FieldStatistics fieldStatistics() {
		return this.fieldStatistics;
	}

	/**
	 * Required - API name: {@code terms}
	 */
	public Map<String, Term> terms() {
		return this.terms;
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

		generator.writeKey("field_statistics");
		this.fieldStatistics.serialize(generator, mapper);

		generator.writeKey("terms");
		generator.writeStartObject();
		for (Map.Entry<String, Term> item0 : this.terms.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermVector}.
	 */
	public static class Builder implements ObjectBuilder<TermVector> {
		private FieldStatistics fieldStatistics;

		private Map<String, Term> terms;

		/**
		 * Required - API name: {@code field_statistics}
		 */
		public Builder fieldStatistics(FieldStatistics value) {
			this.fieldStatistics = value;
			return this;
		}

		/**
		 * Required - API name: {@code field_statistics}
		 */
		public Builder fieldStatistics(Function<FieldStatistics.Builder, ObjectBuilder<FieldStatistics>> fn) {
			return this.fieldStatistics(fn.apply(new FieldStatistics.Builder()).build());
		}

		/**
		 * Required - API name: {@code terms}
		 */
		public Builder terms(Map<String, Term> value) {
			this.terms = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #terms(Map)}, creating the map if needed.
		 */
		public Builder putTerms(String key, Term value) {
			if (this.terms == null) {
				this.terms = new HashMap<>();
			}
			this.terms.put(key, value);
			return this;
		}

		/**
		 * Set {@link #terms(Map)} to a singleton map.
		 */
		public Builder terms(String key, Function<Term.Builder, ObjectBuilder<Term>> fn) {
			return this.terms(Collections.singletonMap(key, fn.apply(new Term.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #terms(Map)}, creating the map if needed.
		 */
		public Builder putTerms(String key, Function<Term.Builder, ObjectBuilder<Term>> fn) {
			return this.putTerms(key, fn.apply(new Term.Builder()).build());
		}

		/**
		 * Builds a {@link TermVector}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermVector build() {

			return new TermVector(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermVector}
	 */
	public static final JsonpDeserializer<TermVector> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			TermVector::setupTermVectorDeserializer, Builder::build);

	protected static void setupTermVectorDeserializer(DelegatingDeserializer<TermVector.Builder> op) {

		op.add(Builder::fieldStatistics, FieldStatistics._DESERIALIZER, "field_statistics");
		op.add(Builder::terms, JsonpDeserializer.stringMapDeserializer(Term._DESERIALIZER), "terms");

	}

}
