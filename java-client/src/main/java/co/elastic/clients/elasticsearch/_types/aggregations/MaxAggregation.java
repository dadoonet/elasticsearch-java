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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;

// typedef: _types.aggregations.MaxAggregation
public final class MaxAggregation extends FormatMetricAggregationBase {
	// ---------------------------------------------------------------------------------------------

	public MaxAggregation(Builder builder) {
		super(builder);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MaxAggregation}.
	 */
	public static class Builder extends FormatMetricAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MaxAggregation> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MaxAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MaxAggregation build() {

			return new MaxAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MaxAggregation}
	 */
	public static final JsonpDeserializer<MaxAggregation> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, MaxAggregation::setupMaxAggregationDeserializer);

	protected static void setupMaxAggregationDeserializer(DelegatingDeserializer<MaxAggregation.Builder> op) {
		FormatMetricAggregationBase.setupFormatMetricAggregationBaseDeserializer(op);

	}

}