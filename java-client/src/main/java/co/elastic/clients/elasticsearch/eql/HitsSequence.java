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

package co.elastic.clients.elasticsearch.eql;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpSerializer;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

// typedef: eql._types.HitsSequence

public final class HitsSequence<TEvent> implements JsonpSerializable {
	private final List<HitsEvent<TEvent>> events;

	private final List<JsonData> joinKeys;

	@Nullable
	private final JsonpSerializer<TEvent> tEventSerializer;

	// ---------------------------------------------------------------------------------------------

	public HitsSequence(Builder<TEvent> builder) {

		this.events = ModelTypeHelper.unmodifiableNonNull(builder.events, "events");
		this.joinKeys = ModelTypeHelper.unmodifiableNonNull(builder.joinKeys, "join_keys");
		this.tEventSerializer = builder.tEventSerializer;

	}

	public HitsSequence(Function<Builder<TEvent>, Builder<TEvent>> fn) {
		this(fn.apply(new Builder<>()));
	}

	/**
	 * Required - Contains events matching the query. Each object represents a
	 * matching event.
	 * <p>
	 * API name: {@code events}
	 */
	public List<HitsEvent<TEvent>> events() {
		return this.events;
	}

	/**
	 * Required - Shared field values used to constrain matches in the sequence.
	 * These are defined using the by keyword in the EQL query syntax.
	 * <p>
	 * API name: {@code join_keys}
	 */
	public List<JsonData> joinKeys() {
		return this.joinKeys;
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

		generator.writeKey("events");
		generator.writeStartArray();
		for (HitsEvent<TEvent> item0 : this.events) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("join_keys");
		generator.writeStartArray();
		for (JsonData item0 : this.joinKeys) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link HitsSequence}.
	 */
	public static class Builder<TEvent> implements ObjectBuilder<HitsSequence<TEvent>> {
		private List<HitsEvent<TEvent>> events;

		private List<JsonData> joinKeys;

		@Nullable
		private JsonpSerializer<TEvent> tEventSerializer;

		/**
		 * Required - Contains events matching the query. Each object represents a
		 * matching event.
		 * <p>
		 * API name: {@code events}
		 */
		public Builder<TEvent> events(List<HitsEvent<TEvent>> value) {
			this.events = value;
			return this;
		}

		/**
		 * Required - Contains events matching the query. Each object represents a
		 * matching event.
		 * <p>
		 * API name: {@code events}
		 */
		public Builder<TEvent> events(HitsEvent<TEvent>... value) {
			this.events = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #events(List)}, creating the list if needed.
		 */
		public Builder<TEvent> addEvents(HitsEvent<TEvent> value) {
			if (this.events == null) {
				this.events = new ArrayList<>();
			}
			this.events.add(value);
			return this;
		}

		/**
		 * Set {@link #events(List)} to a singleton list.
		 */
		public Builder<TEvent> events(Function<HitsEvent.Builder<TEvent>, ObjectBuilder<HitsEvent<TEvent>>> fn) {
			return this.events(fn.apply(new HitsEvent.Builder<TEvent>()).build());
		}

		/**
		 * Add a value to {@link #events(List)}, creating the list if needed.
		 */
		public Builder<TEvent> addEvents(Function<HitsEvent.Builder<TEvent>, ObjectBuilder<HitsEvent<TEvent>>> fn) {
			return this.addEvents(fn.apply(new HitsEvent.Builder<TEvent>()).build());
		}

		/**
		 * Required - Shared field values used to constrain matches in the sequence.
		 * These are defined using the by keyword in the EQL query syntax.
		 * <p>
		 * API name: {@code join_keys}
		 */
		public Builder<TEvent> joinKeys(List<JsonData> value) {
			this.joinKeys = value;
			return this;
		}

		/**
		 * Required - Shared field values used to constrain matches in the sequence.
		 * These are defined using the by keyword in the EQL query syntax.
		 * <p>
		 * API name: {@code join_keys}
		 */
		public Builder<TEvent> joinKeys(JsonData... value) {
			this.joinKeys = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #joinKeys(List)}, creating the list if needed.
		 */
		public Builder<TEvent> addJoinKeys(JsonData value) {
			if (this.joinKeys == null) {
				this.joinKeys = new ArrayList<>();
			}
			this.joinKeys.add(value);
			return this;
		}

		/**
		 * Serializer for TEvent. If not set, an attempt will be made to find a
		 * serializer from the JSON context.
		 */
		public Builder<TEvent> tEventSerializer(@Nullable JsonpSerializer<TEvent> value) {
			this.tEventSerializer = value;
			return this;
		}

		/**
		 * Builds a {@link HitsSequence}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public HitsSequence<TEvent> build() {

			return new HitsSequence<TEvent>(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Create a json deserializer for HitsSequence
	 */
	public static <TEvent> JsonpDeserializer<HitsSequence<TEvent>> createHitsSequenceDeserializer(
			JsonpDeserializer<TEvent> tEventDeserializer) {
		return ObjectBuilderDeserializer.createForObject((Supplier<Builder<TEvent>>) Builder::new,
				op -> HitsSequence.setupHitsSequenceDeserializer(op, tEventDeserializer));
	};

	protected static <TEvent> void setupHitsSequenceDeserializer(
			DelegatingDeserializer<HitsSequence.Builder<TEvent>> op, JsonpDeserializer<TEvent> tEventDeserializer) {

		op.add(Builder::events,
				JsonpDeserializer.arrayDeserializer(HitsEvent.createHitsEventDeserializer(tEventDeserializer)),
				"events");
		op.add(Builder::joinKeys, JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER), "join_keys");

	}

}
