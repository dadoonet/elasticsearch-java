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

package co.elastic.clients.elasticsearch.ccr.stats;

import co.elastic.clients.elasticsearch._types.ErrorCause;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.stats.AutoFollowStats
@JsonpDeserializable
public final class AutoFollowStats implements JsonpSerializable {
	private final List<AutoFollowedCluster> autoFollowedClusters;

	private final long numberOfFailedFollowIndices;

	private final long numberOfFailedRemoteClusterStateRequests;

	private final long numberOfSuccessfulFollowIndices;

	private final List<ErrorCause> recentAutoFollowErrors;

	// ---------------------------------------------------------------------------------------------

	public AutoFollowStats(Builder builder) {

		this.autoFollowedClusters = ModelTypeHelper.unmodifiableNonNull(builder.autoFollowedClusters,
				"auto_followed_clusters");
		this.numberOfFailedFollowIndices = Objects.requireNonNull(builder.numberOfFailedFollowIndices,
				"number_of_failed_follow_indices");
		this.numberOfFailedRemoteClusterStateRequests = Objects.requireNonNull(
				builder.numberOfFailedRemoteClusterStateRequests, "number_of_failed_remote_cluster_state_requests");
		this.numberOfSuccessfulFollowIndices = Objects.requireNonNull(builder.numberOfSuccessfulFollowIndices,
				"number_of_successful_follow_indices");
		this.recentAutoFollowErrors = ModelTypeHelper.unmodifiableNonNull(builder.recentAutoFollowErrors,
				"recent_auto_follow_errors");

	}

	public AutoFollowStats(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code auto_followed_clusters}
	 */
	public List<AutoFollowedCluster> autoFollowedClusters() {
		return this.autoFollowedClusters;
	}

	/**
	 * Required - API name: {@code number_of_failed_follow_indices}
	 */
	public long numberOfFailedFollowIndices() {
		return this.numberOfFailedFollowIndices;
	}

	/**
	 * Required - API name: {@code number_of_failed_remote_cluster_state_requests}
	 */
	public long numberOfFailedRemoteClusterStateRequests() {
		return this.numberOfFailedRemoteClusterStateRequests;
	}

	/**
	 * Required - API name: {@code number_of_successful_follow_indices}
	 */
	public long numberOfSuccessfulFollowIndices() {
		return this.numberOfSuccessfulFollowIndices;
	}

	/**
	 * Required - API name: {@code recent_auto_follow_errors}
	 */
	public List<ErrorCause> recentAutoFollowErrors() {
		return this.recentAutoFollowErrors;
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

		generator.writeKey("auto_followed_clusters");
		generator.writeStartArray();
		for (AutoFollowedCluster item0 : this.autoFollowedClusters) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("number_of_failed_follow_indices");
		generator.write(this.numberOfFailedFollowIndices);

		generator.writeKey("number_of_failed_remote_cluster_state_requests");
		generator.write(this.numberOfFailedRemoteClusterStateRequests);

		generator.writeKey("number_of_successful_follow_indices");
		generator.write(this.numberOfSuccessfulFollowIndices);

		generator.writeKey("recent_auto_follow_errors");
		generator.writeStartArray();
		for (ErrorCause item0 : this.recentAutoFollowErrors) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoFollowStats}.
	 */
	public static class Builder implements ObjectBuilder<AutoFollowStats> {
		private List<AutoFollowedCluster> autoFollowedClusters;

		private Long numberOfFailedFollowIndices;

		private Long numberOfFailedRemoteClusterStateRequests;

		private Long numberOfSuccessfulFollowIndices;

		private List<ErrorCause> recentAutoFollowErrors;

		/**
		 * Required - API name: {@code auto_followed_clusters}
		 */
		public Builder autoFollowedClusters(List<AutoFollowedCluster> value) {
			this.autoFollowedClusters = value;
			return this;
		}

		/**
		 * Required - API name: {@code auto_followed_clusters}
		 */
		public Builder autoFollowedClusters(AutoFollowedCluster... value) {
			this.autoFollowedClusters = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #autoFollowedClusters(List)}, creating the list if
		 * needed.
		 */
		public Builder addAutoFollowedClusters(AutoFollowedCluster value) {
			if (this.autoFollowedClusters == null) {
				this.autoFollowedClusters = new ArrayList<>();
			}
			this.autoFollowedClusters.add(value);
			return this;
		}

		/**
		 * Set {@link #autoFollowedClusters(List)} to a singleton list.
		 */
		public Builder autoFollowedClusters(
				Function<AutoFollowedCluster.Builder, ObjectBuilder<AutoFollowedCluster>> fn) {
			return this.autoFollowedClusters(fn.apply(new AutoFollowedCluster.Builder()).build());
		}

		/**
		 * Add a value to {@link #autoFollowedClusters(List)}, creating the list if
		 * needed.
		 */
		public Builder addAutoFollowedClusters(
				Function<AutoFollowedCluster.Builder, ObjectBuilder<AutoFollowedCluster>> fn) {
			return this.addAutoFollowedClusters(fn.apply(new AutoFollowedCluster.Builder()).build());
		}

		/**
		 * Required - API name: {@code number_of_failed_follow_indices}
		 */
		public Builder numberOfFailedFollowIndices(long value) {
			this.numberOfFailedFollowIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code number_of_failed_remote_cluster_state_requests}
		 */
		public Builder numberOfFailedRemoteClusterStateRequests(long value) {
			this.numberOfFailedRemoteClusterStateRequests = value;
			return this;
		}

		/**
		 * Required - API name: {@code number_of_successful_follow_indices}
		 */
		public Builder numberOfSuccessfulFollowIndices(long value) {
			this.numberOfSuccessfulFollowIndices = value;
			return this;
		}

		/**
		 * Required - API name: {@code recent_auto_follow_errors}
		 */
		public Builder recentAutoFollowErrors(List<ErrorCause> value) {
			this.recentAutoFollowErrors = value;
			return this;
		}

		/**
		 * Required - API name: {@code recent_auto_follow_errors}
		 */
		public Builder recentAutoFollowErrors(ErrorCause... value) {
			this.recentAutoFollowErrors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #recentAutoFollowErrors(List)}, creating the list if
		 * needed.
		 */
		public Builder addRecentAutoFollowErrors(ErrorCause value) {
			if (this.recentAutoFollowErrors == null) {
				this.recentAutoFollowErrors = new ArrayList<>();
			}
			this.recentAutoFollowErrors.add(value);
			return this;
		}

		/**
		 * Set {@link #recentAutoFollowErrors(List)} to a singleton list.
		 */
		public Builder recentAutoFollowErrors(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.recentAutoFollowErrors(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #recentAutoFollowErrors(List)}, creating the list if
		 * needed.
		 */
		public Builder addRecentAutoFollowErrors(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.addRecentAutoFollowErrors(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Builds a {@link AutoFollowStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoFollowStats build() {

			return new AutoFollowStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoFollowStats}
	 */
	public static final JsonpDeserializer<AutoFollowStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AutoFollowStats::setupAutoFollowStatsDeserializer, Builder::build);

	protected static void setupAutoFollowStatsDeserializer(DelegatingDeserializer<AutoFollowStats.Builder> op) {

		op.add(Builder::autoFollowedClusters, JsonpDeserializer.arrayDeserializer(AutoFollowedCluster._DESERIALIZER),
				"auto_followed_clusters");
		op.add(Builder::numberOfFailedFollowIndices, JsonpDeserializer.longDeserializer(),
				"number_of_failed_follow_indices");
		op.add(Builder::numberOfFailedRemoteClusterStateRequests, JsonpDeserializer.longDeserializer(),
				"number_of_failed_remote_cluster_state_requests");
		op.add(Builder::numberOfSuccessfulFollowIndices, JsonpDeserializer.longDeserializer(),
				"number_of_successful_follow_indices");
		op.add(Builder::recentAutoFollowErrors, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER),
				"recent_auto_follow_errors");

	}

}
