/*
 * Copyright 2016, gRPC Authors All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.testing.integration;

import static io.grpc.testing.integration.TestCases.fromString;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit tests for {@link TestCases}.
 */
@RunWith(JUnit4.class)
public class TestCasesTest {

  @Test(expected = IllegalArgumentException.class)
  public void unknownStringThrowsException() {
    fromString("does_not_exist_1234");
  }

  @Test
  public void testCaseNamesShouldMapToEnums() {
    // names of testcases as defined in the interop spec
    String[] testCases = {
      "empty_unary",
      "cacheable_unary",
      "large_unary",
      "client_streaming",
      "server_streaming",
      "ping_pong",
      "empty_stream",
      "compute_engine_creds",
      "service_account_creds",
      "jwt_token_creds",
      "oauth2_auth_token",
      "per_rpc_creds",
      "custom_metadata",
      "status_code_and_message",
      "unimplemented_method",
      "unimplemented_service",
      "cancel_after_begin",
      "cancel_after_first_response",
      "timeout_on_sleeping_server"
    };

    assertEquals(testCases.length, TestCases.values().length);

    Set<TestCases> testCaseSet = new HashSet<TestCases>(testCases.length);
    for (String testCase : testCases) {
      testCaseSet.add(TestCases.fromString(testCase));
    }

    assertEquals(TestCases.values().length, testCaseSet.size());
  }
}
