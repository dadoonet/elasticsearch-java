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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.elasticsearch._types.BaseNode;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
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

// typedef: tasks._types.TaskExecutingNode
@JsonpDeserializable
public final class TaskExecutingNode extends BaseNode {
	private final Map<String, State> tasks;

	// ---------------------------------------------------------------------------------------------

	public TaskExecutingNode(Builder builder) {
		super(builder);

		this.tasks = ModelTypeHelper.unmodifiableNonNull(builder.tasks, "tasks");

	}

	public TaskExecutingNode(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code tasks}
	 */
	public Map<String, State> tasks() {
		return this.tasks;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("tasks");
		generator.writeStartObject();
		for (Map.Entry<String, State> item0 : this.tasks.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TaskExecutingNode}.
	 */
	public static class Builder extends BaseNode.AbstractBuilder<Builder> implements ObjectBuilder<TaskExecutingNode> {
		private Map<String, State> tasks;

		/**
		 * Required - API name: {@code tasks}
		 */
		public Builder tasks(Map<String, State> value) {
			this.tasks = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #tasks(Map)}, creating the map if needed.
		 */
		public Builder putTasks(String key, State value) {
			if (this.tasks == null) {
				this.tasks = new HashMap<>();
			}
			this.tasks.put(key, value);
			return this;
		}

		/**
		 * Set {@link #tasks(Map)} to a singleton map.
		 */
		public Builder tasks(String key, Function<State.Builder, ObjectBuilder<State>> fn) {
			return this.tasks(Collections.singletonMap(key, fn.apply(new State.Builder()).build()));
		}

		/**
		 * Add a key/value to {@link #tasks(Map)}, creating the map if needed.
		 */
		public Builder putTasks(String key, Function<State.Builder, ObjectBuilder<State>> fn) {
			return this.putTasks(key, fn.apply(new State.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TaskExecutingNode}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TaskExecutingNode build() {

			return new TaskExecutingNode(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TaskExecutingNode}
	 */
	public static final JsonpDeserializer<TaskExecutingNode> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TaskExecutingNode::setupTaskExecutingNodeDeserializer, Builder::build);

	protected static void setupTaskExecutingNodeDeserializer(DelegatingDeserializer<TaskExecutingNode.Builder> op) {
		BaseNode.setupBaseNodeDeserializer(op);
		op.add(Builder::tasks, JsonpDeserializer.stringMapDeserializer(State._DESERIALIZER), "tasks");

	}

}
