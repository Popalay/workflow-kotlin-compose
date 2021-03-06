/*
 * Copyright 2020 Square Inc.
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
package com.squareup.sample.hellocomposerendering

// There is a bug in Compose dev12 that crashes the compiler when processing this code.
// See https://github.com/square/workflow-kotlin-compose/issues/42.
// /**
//  * A [ComposeWorkflow] that is used by [HelloWorkflow] to render the screen.
//  *
//  * This workflow has type `Workflow<String, Toggle, ComposeRendering>`.
//  */
// object HelloRenderingWorkflow : ComposeWorkflow<String, Toggle>() {
//
//   object Toggle
//
//   @Composable override fun render(
//     props: String,
//     outputSink: Sink<Toggle>,
//     viewEnvironment: ViewEnvironment
//   ) {
//     MaterialTheme {
//       Text(
//           props,
//           modifier = Modifier
//               .ripple()
//               .clickable(onClick = { outputSink.send(Toggle) })
//               .wrapContentSize(Alignment.Center)
//       )
//     }
//   }
// }
//
// @Preview(showBackground = true)
// @Composable fun HelloRenderingWorkflowPreview() {
//   HelloRenderingWorkflow.preview(props = "hello")
// }
