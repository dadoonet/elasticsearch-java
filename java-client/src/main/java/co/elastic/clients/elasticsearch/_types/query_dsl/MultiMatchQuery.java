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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.MultiMatchQuery
@JsonpDeserializable
public final class MultiMatchQuery extends QueryBase implements QueryVariant {
	@Nullable
	private final String analyzer;

	@Nullable
	private final Boolean autoGenerateSynonymsPhraseQuery;

	@Nullable
	private final Double cutoffFrequency;

	@Nullable
	private final List<String> fields;

	@Nullable
	private final String fuzziness;

	@Nullable
	private final String fuzzyRewrite;

	@Nullable
	private final Boolean fuzzyTranspositions;

	@Nullable
	private final Boolean lenient;

	@Nullable
	private final Integer maxExpansions;

	@Nullable
	private final String minimumShouldMatch;

	@Nullable
	private final Operator operator;

	@Nullable
	private final Integer prefixLength;

	private final String query;

	@Nullable
	private final Integer slop;

	@Nullable
	private final Double tieBreaker;

	@Nullable
	private final TextQueryType type;

	@Nullable
	private final ZeroTermsQuery zeroTermsQuery;

	// ---------------------------------------------------------------------------------------------

	public MultiMatchQuery(Builder builder) {
		super(builder);

		this.analyzer = builder.analyzer;
		this.autoGenerateSynonymsPhraseQuery = builder.autoGenerateSynonymsPhraseQuery;
		this.cutoffFrequency = builder.cutoffFrequency;
		this.fields = ModelTypeHelper.unmodifiable(builder.fields);
		this.fuzziness = builder.fuzziness;
		this.fuzzyRewrite = builder.fuzzyRewrite;
		this.fuzzyTranspositions = builder.fuzzyTranspositions;
		this.lenient = builder.lenient;
		this.maxExpansions = builder.maxExpansions;
		this.minimumShouldMatch = builder.minimumShouldMatch;
		this.operator = builder.operator;
		this.prefixLength = builder.prefixLength;
		this.query = Objects.requireNonNull(builder.query, "query");
		this.slop = builder.slop;
		this.tieBreaker = builder.tieBreaker;
		this.type = builder.type;
		this.zeroTermsQuery = builder.zeroTermsQuery;

	}

	public MultiMatchQuery(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Query} variant type
	 */
	@Override
	public String _variantType() {
		return "multi_match";
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code auto_generate_synonyms_phrase_query}
	 */
	@Nullable
	public Boolean autoGenerateSynonymsPhraseQuery() {
		return this.autoGenerateSynonymsPhraseQuery;
	}

	/**
	 * API name: {@code cutoff_frequency}
	 */
	@Nullable
	public Double cutoffFrequency() {
		return this.cutoffFrequency;
	}

	/**
	 * API name: {@code fields}
	 */
	@Nullable
	public List<String> fields() {
		return this.fields;
	}

	/**
	 * API name: {@code fuzziness}
	 */
	@Nullable
	public String fuzziness() {
		return this.fuzziness;
	}

	/**
	 * API name: {@code fuzzy_rewrite}
	 */
	@Nullable
	public String fuzzyRewrite() {
		return this.fuzzyRewrite;
	}

	/**
	 * API name: {@code fuzzy_transpositions}
	 */
	@Nullable
	public Boolean fuzzyTranspositions() {
		return this.fuzzyTranspositions;
	}

	/**
	 * API name: {@code lenient}
	 */
	@Nullable
	public Boolean lenient() {
		return this.lenient;
	}

	/**
	 * API name: {@code max_expansions}
	 */
	@Nullable
	public Integer maxExpansions() {
		return this.maxExpansions;
	}

	/**
	 * API name: {@code minimum_should_match}
	 */
	@Nullable
	public String minimumShouldMatch() {
		return this.minimumShouldMatch;
	}

	/**
	 * API name: {@code operator}
	 */
	@Nullable
	public Operator operator() {
		return this.operator;
	}

	/**
	 * API name: {@code prefix_length}
	 */
	@Nullable
	public Integer prefixLength() {
		return this.prefixLength;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public String query() {
		return this.query;
	}

	/**
	 * API name: {@code slop}
	 */
	@Nullable
	public Integer slop() {
		return this.slop;
	}

	/**
	 * API name: {@code tie_breaker}
	 */
	@Nullable
	public Double tieBreaker() {
		return this.tieBreaker;
	}

	/**
	 * API name: {@code type}
	 */
	@Nullable
	public TextQueryType type() {
		return this.type;
	}

	/**
	 * API name: {@code zero_terms_query}
	 */
	@Nullable
	public ZeroTermsQuery zeroTermsQuery() {
		return this.zeroTermsQuery;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.analyzer != null) {

			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		if (this.autoGenerateSynonymsPhraseQuery != null) {

			generator.writeKey("auto_generate_synonyms_phrase_query");
			generator.write(this.autoGenerateSynonymsPhraseQuery);

		}
		if (this.cutoffFrequency != null) {

			generator.writeKey("cutoff_frequency");
			generator.write(this.cutoffFrequency);

		}
		if (this.fields != null) {

			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.fuzziness != null) {

			generator.writeKey("fuzziness");
			generator.write(this.fuzziness);

		}
		if (this.fuzzyRewrite != null) {

			generator.writeKey("fuzzy_rewrite");
			generator.write(this.fuzzyRewrite);

		}
		if (this.fuzzyTranspositions != null) {

			generator.writeKey("fuzzy_transpositions");
			generator.write(this.fuzzyTranspositions);

		}
		if (this.lenient != null) {

			generator.writeKey("lenient");
			generator.write(this.lenient);

		}
		if (this.maxExpansions != null) {

			generator.writeKey("max_expansions");
			generator.write(this.maxExpansions);

		}
		if (this.minimumShouldMatch != null) {

			generator.writeKey("minimum_should_match");
			generator.write(this.minimumShouldMatch);

		}
		if (this.operator != null) {

			generator.writeKey("operator");
			this.operator.serialize(generator, mapper);
		}
		if (this.prefixLength != null) {

			generator.writeKey("prefix_length");
			generator.write(this.prefixLength);

		}

		generator.writeKey("query");
		generator.write(this.query);

		if (this.slop != null) {

			generator.writeKey("slop");
			generator.write(this.slop);

		}
		if (this.tieBreaker != null) {

			generator.writeKey("tie_breaker");
			generator.write(this.tieBreaker);

		}
		if (this.type != null) {

			generator.writeKey("type");
			this.type.serialize(generator, mapper);
		}
		if (this.zeroTermsQuery != null) {

			generator.writeKey("zero_terms_query");
			this.zeroTermsQuery.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MultiMatchQuery}.
	 */
	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<MultiMatchQuery> {
		@Nullable
		private String analyzer;

		@Nullable
		private Boolean autoGenerateSynonymsPhraseQuery;

		@Nullable
		private Double cutoffFrequency;

		@Nullable
		private List<String> fields;

		@Nullable
		private String fuzziness;

		@Nullable
		private String fuzzyRewrite;

		@Nullable
		private Boolean fuzzyTranspositions;

		@Nullable
		private Boolean lenient;

		@Nullable
		private Integer maxExpansions;

		@Nullable
		private String minimumShouldMatch;

		@Nullable
		private Operator operator;

		@Nullable
		private Integer prefixLength;

		private String query;

		@Nullable
		private Integer slop;

		@Nullable
		private Double tieBreaker;

		@Nullable
		private TextQueryType type;

		@Nullable
		private ZeroTermsQuery zeroTermsQuery;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * API name: {@code auto_generate_synonyms_phrase_query}
		 */
		public Builder autoGenerateSynonymsPhraseQuery(@Nullable Boolean value) {
			this.autoGenerateSynonymsPhraseQuery = value;
			return this;
		}

		/**
		 * API name: {@code cutoff_frequency}
		 */
		public Builder cutoffFrequency(@Nullable Double value) {
			this.cutoffFrequency = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(@Nullable List<String> value) {
			this.fields = value;
			return this;
		}

		/**
		 * API name: {@code fields}
		 */
		public Builder fields(String... value) {
			this.fields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #fields(List)}, creating the list if needed.
		 */
		public Builder addFields(String value) {
			if (this.fields == null) {
				this.fields = new ArrayList<>();
			}
			this.fields.add(value);
			return this;
		}

		/**
		 * API name: {@code fuzziness}
		 */
		public Builder fuzziness(@Nullable String value) {
			this.fuzziness = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy_rewrite}
		 */
		public Builder fuzzyRewrite(@Nullable String value) {
			this.fuzzyRewrite = value;
			return this;
		}

		/**
		 * API name: {@code fuzzy_transpositions}
		 */
		public Builder fuzzyTranspositions(@Nullable Boolean value) {
			this.fuzzyTranspositions = value;
			return this;
		}

		/**
		 * API name: {@code lenient}
		 */
		public Builder lenient(@Nullable Boolean value) {
			this.lenient = value;
			return this;
		}

		/**
		 * API name: {@code max_expansions}
		 */
		public Builder maxExpansions(@Nullable Integer value) {
			this.maxExpansions = value;
			return this;
		}

		/**
		 * API name: {@code minimum_should_match}
		 */
		public Builder minimumShouldMatch(@Nullable String value) {
			this.minimumShouldMatch = value;
			return this;
		}

		/**
		 * API name: {@code operator}
		 */
		public Builder operator(@Nullable Operator value) {
			this.operator = value;
			return this;
		}

		/**
		 * API name: {@code prefix_length}
		 */
		public Builder prefixLength(@Nullable Integer value) {
			this.prefixLength = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public Builder query(String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code slop}
		 */
		public Builder slop(@Nullable Integer value) {
			this.slop = value;
			return this;
		}

		/**
		 * API name: {@code tie_breaker}
		 */
		public Builder tieBreaker(@Nullable Double value) {
			this.tieBreaker = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(@Nullable TextQueryType value) {
			this.type = value;
			return this;
		}

		/**
		 * API name: {@code zero_terms_query}
		 */
		public Builder zeroTermsQuery(@Nullable ZeroTermsQuery value) {
			this.zeroTermsQuery = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MultiMatchQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MultiMatchQuery build() {

			return new MultiMatchQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MultiMatchQuery}
	 */
	public static final JsonpDeserializer<MultiMatchQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MultiMatchQuery::setupMultiMatchQueryDeserializer, Builder::build);

	protected static void setupMultiMatchQueryDeserializer(DelegatingDeserializer<MultiMatchQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::autoGenerateSynonymsPhraseQuery, JsonpDeserializer.booleanDeserializer(),
				"auto_generate_synonyms_phrase_query");
		op.add(Builder::cutoffFrequency, JsonpDeserializer.doubleDeserializer(), "cutoff_frequency");
		op.add(Builder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "fields");
		op.add(Builder::fuzziness, JsonpDeserializer.stringDeserializer(), "fuzziness");
		op.add(Builder::fuzzyRewrite, JsonpDeserializer.stringDeserializer(), "fuzzy_rewrite");
		op.add(Builder::fuzzyTranspositions, JsonpDeserializer.booleanDeserializer(), "fuzzy_transpositions");
		op.add(Builder::lenient, JsonpDeserializer.booleanDeserializer(), "lenient");
		op.add(Builder::maxExpansions, JsonpDeserializer.integerDeserializer(), "max_expansions");
		op.add(Builder::minimumShouldMatch, JsonpDeserializer.stringDeserializer(), "minimum_should_match");
		op.add(Builder::operator, Operator._DESERIALIZER, "operator");
		op.add(Builder::prefixLength, JsonpDeserializer.integerDeserializer(), "prefix_length");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::slop, JsonpDeserializer.integerDeserializer(), "slop");
		op.add(Builder::tieBreaker, JsonpDeserializer.doubleDeserializer(), "tie_breaker");
		op.add(Builder::type, TextQueryType._DESERIALIZER, "type");
		op.add(Builder::zeroTermsQuery, ZeroTermsQuery._DESERIALIZER, "zero_terms_query");

	}

}
