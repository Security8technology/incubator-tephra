/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.cask.tephra.distributed;

/**
 * A retry strategy is an abstraction over how the remote tx client shuold retry operations after connection
 * failures.
 */
public abstract class RetryStrategy {

  /**
   * Increments the number of failed attempts.
   * @return whether another attempt should be made
   */
  abstract boolean failOnce();

  /**
   * Should be called before re-attempting. This can, for instance
   * inject a sleep time between retries. Default implementation is
   * to do nothing.
   */
  void beforeRetry() {
    // do nothinhg
  }

}
