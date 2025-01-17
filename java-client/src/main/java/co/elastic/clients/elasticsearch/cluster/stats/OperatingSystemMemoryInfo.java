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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: cluster.stats.OperatingSystemMemoryInfo
@JsonpDeserializable
public final class OperatingSystemMemoryInfo implements JsonpSerializable {
	private final long freeInBytes;

	private final int freePercent;

	private final long totalInBytes;

	private final long usedInBytes;

	private final int usedPercent;

	// ---------------------------------------------------------------------------------------------

	public OperatingSystemMemoryInfo(Builder builder) {

		this.freeInBytes = Objects.requireNonNull(builder.freeInBytes, "free_in_bytes");
		this.freePercent = Objects.requireNonNull(builder.freePercent, "free_percent");
		this.totalInBytes = Objects.requireNonNull(builder.totalInBytes, "total_in_bytes");
		this.usedInBytes = Objects.requireNonNull(builder.usedInBytes, "used_in_bytes");
		this.usedPercent = Objects.requireNonNull(builder.usedPercent, "used_percent");

	}

	public OperatingSystemMemoryInfo(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code free_in_bytes}
	 */
	public long freeInBytes() {
		return this.freeInBytes;
	}

	/**
	 * Required - API name: {@code free_percent}
	 */
	public int freePercent() {
		return this.freePercent;
	}

	/**
	 * Required - API name: {@code total_in_bytes}
	 */
	public long totalInBytes() {
		return this.totalInBytes;
	}

	/**
	 * Required - API name: {@code used_in_bytes}
	 */
	public long usedInBytes() {
		return this.usedInBytes;
	}

	/**
	 * Required - API name: {@code used_percent}
	 */
	public int usedPercent() {
		return this.usedPercent;
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

		generator.writeKey("free_in_bytes");
		generator.write(this.freeInBytes);

		generator.writeKey("free_percent");
		generator.write(this.freePercent);

		generator.writeKey("total_in_bytes");
		generator.write(this.totalInBytes);

		generator.writeKey("used_in_bytes");
		generator.write(this.usedInBytes);

		generator.writeKey("used_percent");
		generator.write(this.usedPercent);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link OperatingSystemMemoryInfo}.
	 */
	public static class Builder implements ObjectBuilder<OperatingSystemMemoryInfo> {
		private Long freeInBytes;

		private Integer freePercent;

		private Long totalInBytes;

		private Long usedInBytes;

		private Integer usedPercent;

		/**
		 * Required - API name: {@code free_in_bytes}
		 */
		public Builder freeInBytes(long value) {
			this.freeInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code free_percent}
		 */
		public Builder freePercent(int value) {
			this.freePercent = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_in_bytes}
		 */
		public Builder totalInBytes(long value) {
			this.totalInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code used_in_bytes}
		 */
		public Builder usedInBytes(long value) {
			this.usedInBytes = value;
			return this;
		}

		/**
		 * Required - API name: {@code used_percent}
		 */
		public Builder usedPercent(int value) {
			this.usedPercent = value;
			return this;
		}

		/**
		 * Builds a {@link OperatingSystemMemoryInfo}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public OperatingSystemMemoryInfo build() {

			return new OperatingSystemMemoryInfo(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link OperatingSystemMemoryInfo}
	 */
	public static final JsonpDeserializer<OperatingSystemMemoryInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, OperatingSystemMemoryInfo::setupOperatingSystemMemoryInfoDeserializer, Builder::build);

	protected static void setupOperatingSystemMemoryInfoDeserializer(
			DelegatingDeserializer<OperatingSystemMemoryInfo.Builder> op) {

		op.add(Builder::freeInBytes, JsonpDeserializer.longDeserializer(), "free_in_bytes");
		op.add(Builder::freePercent, JsonpDeserializer.integerDeserializer(), "free_percent");
		op.add(Builder::totalInBytes, JsonpDeserializer.longDeserializer(), "total_in_bytes");
		op.add(Builder::usedInBytes, JsonpDeserializer.longDeserializer(), "used_in_bytes");
		op.add(Builder::usedPercent, JsonpDeserializer.integerDeserializer(), "used_percent");

	}

}
