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

package co.elastic.clients.elasticsearch.cluster.allocation_explain;

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
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.allocation_explain.ReservedSize
@JsonpDeserializable
public final class ReservedSize implements JsonpSerializable {
	private final String nodeId;

	private final String path;

	private final long total;

	private final List<String> shards;

	// ---------------------------------------------------------------------------------------------

	public ReservedSize(Builder builder) {

		this.nodeId = Objects.requireNonNull(builder.nodeId, "node_id");
		this.path = Objects.requireNonNull(builder.path, "path");
		this.total = Objects.requireNonNull(builder.total, "total");
		this.shards = ModelTypeHelper.unmodifiableNonNull(builder.shards, "shards");

	}

	public ReservedSize(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code node_id}
	 */
	public String nodeId() {
		return this.nodeId;
	}

	/**
	 * Required - API name: {@code path}
	 */
	public String path() {
		return this.path;
	}

	/**
	 * Required - API name: {@code total}
	 */
	public long total() {
		return this.total;
	}

	/**
	 * Required - API name: {@code shards}
	 */
	public List<String> shards() {
		return this.shards;
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

		generator.writeKey("node_id");
		generator.write(this.nodeId);

		generator.writeKey("path");
		generator.write(this.path);

		generator.writeKey("total");
		generator.write(this.total);

		generator.writeKey("shards");
		generator.writeStartArray();
		for (String item0 : this.shards) {
			generator.write(item0);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ReservedSize}.
	 */
	public static class Builder implements ObjectBuilder<ReservedSize> {
		private String nodeId;

		private String path;

		private Long total;

		private List<String> shards;

		/**
		 * Required - API name: {@code node_id}
		 */
		public Builder nodeId(String value) {
			this.nodeId = value;
			return this;
		}

		/**
		 * Required - API name: {@code path}
		 */
		public Builder path(String value) {
			this.path = value;
			return this;
		}

		/**
		 * Required - API name: {@code total}
		 */
		public Builder total(long value) {
			this.total = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public Builder shards(List<String> value) {
			this.shards = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards}
		 */
		public Builder shards(String... value) {
			this.shards = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #shards(List)}, creating the list if needed.
		 */
		public Builder addShards(String value) {
			if (this.shards == null) {
				this.shards = new ArrayList<>();
			}
			this.shards.add(value);
			return this;
		}

		/**
		 * Builds a {@link ReservedSize}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ReservedSize build() {

			return new ReservedSize(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ReservedSize}
	 */
	public static final JsonpDeserializer<ReservedSize> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ReservedSize::setupReservedSizeDeserializer, Builder::build);

	protected static void setupReservedSizeDeserializer(DelegatingDeserializer<ReservedSize.Builder> op) {

		op.add(Builder::nodeId, JsonpDeserializer.stringDeserializer(), "node_id");
		op.add(Builder::path, JsonpDeserializer.stringDeserializer(), "path");
		op.add(Builder::total, JsonpDeserializer.longDeserializer(), "total");
		op.add(Builder::shards, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "shards");

	}

}
