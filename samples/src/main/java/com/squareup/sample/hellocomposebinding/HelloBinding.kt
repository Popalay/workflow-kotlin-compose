/*
 * Copyright 2019 Square Inc.
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
package com.squareup.sample.hellocomposebinding

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.clickable
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.wrapContentSize
import androidx.ui.tooling.preview.Preview
import com.squareup.sample.hellocomposebinding.HelloWorkflow.Rendering
import com.squareup.workflow.ui.compose.composedViewFactory
import com.squareup.workflow.ui.compose.tooling.preview

val HelloBinding = composedViewFactory<Rendering> { rendering, _ ->
  Text(
      rendering.message,
      modifier = Modifier.fillMaxSize()
          .clickable(onClick = rendering.onClick)
          .wrapContentSize(Alignment.Center)
  )
}

@Preview(heightDp = 150, showBackground = true)
@Composable fun DrawHelloRenderingPreview() {
  HelloBinding.preview(Rendering("Hello!", onClick = {}))
}
