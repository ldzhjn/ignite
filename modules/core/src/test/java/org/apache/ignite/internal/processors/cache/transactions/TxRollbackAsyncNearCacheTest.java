/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.processors.cache.transactions;

import org.apache.ignite.testframework.MvccFeatureChecker;
import org.junit.Before;

/**
 * Tests an ability to async rollback near transactions.
 */
public class TxRollbackAsyncNearCacheTest extends TxRollbackAsyncTest {
    /** {@inheritDoc} */
    @Override protected boolean nearCacheEnabled() {
        return true;
    }

    /** {@inheritDoc} */
    @Before
    @Override public void setUp() throws Exception {
        MvccFeatureChecker.failIfNotSupported(MvccFeatureChecker.Feature.NEAR_CACHE);

        super.setUp();
    }
}
