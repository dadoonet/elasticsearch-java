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

package co.elastic.clients.elasticsearch.sql;

import co.elastic.clients.ApiClient;
import co.elastic.clients.elasticsearch._types.ElasticsearchException;
import co.elastic.clients.transport.Transport;
import co.elastic.clients.transport.TransportOptions;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.function.Function;
import javax.annotation.Nullable;

/**
 * Client for the sql namespace.
 */
public class ElasticsearchSqlClient extends ApiClient<ElasticsearchSqlClient> {

	public ElasticsearchSqlClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchSqlClient(Transport transport, @Nullable TransportOptions transportOptions) {
		super(transport, transportOptions);
	}

	@Override
	public ElasticsearchSqlClient withTransportOptions(@Nullable TransportOptions transportOptions) {
		return new ElasticsearchSqlClient(this.transport, transportOptions);
	}

	// ----- Endpoint: sql.clear_cursor

	/**
	 * Clears the SQL cursor
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-sql-cursor-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public ClearCursorResponse clearCursor(ClearCursorRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, ClearCursorRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Clears the SQL cursor
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link ClearCursorRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-sql-cursor-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final ClearCursorResponse clearCursor(
			Function<ClearCursorRequest.Builder, ObjectBuilder<ClearCursorRequest>> fn)
			throws IOException, ElasticsearchException {
		return clearCursor(fn.apply(new ClearCursorRequest.Builder()).build());
	}

	// ----- Endpoint: sql.query

	/**
	 * Executes a SQL request
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryResponse query(QueryRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, QueryRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Executes a SQL request
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link QueryRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final QueryResponse query(Function<QueryRequest.Builder, ObjectBuilder<QueryRequest>> fn)
			throws IOException, ElasticsearchException {
		return query(fn.apply(new QueryRequest.Builder()).build());
	}

	/**
	 * Executes a SQL request
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-search-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public QueryResponse query() throws IOException, ElasticsearchException {
		return this.transport.performRequest(new QueryRequest.Builder().build(), QueryRequest.ENDPOINT,
				this.transportOptions);
	}

	// ----- Endpoint: sql.translate

	/**
	 * Translates SQL into Elasticsearch queries
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-translate-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public TranslateResponse translate(TranslateRequest request) throws IOException, ElasticsearchException {
		return this.transport.performRequest(request, TranslateRequest.ENDPOINT, this.transportOptions);
	}

	/**
	 * Translates SQL into Elasticsearch queries
	 * 
	 * @param fn
	 *            a function that initializes a builder to create the
	 *            {@link TranslateRequest}
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/sql-translate-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final TranslateResponse translate(Function<TranslateRequest.Builder, ObjectBuilder<TranslateRequest>> fn)
			throws IOException, ElasticsearchException {
		return translate(fn.apply(new TranslateRequest.Builder()).build());
	}

}
