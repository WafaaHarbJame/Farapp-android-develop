/*
 * Copyright 2019 New Vector Ltd
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

package ms.messageapp.activity

import android.content.Intent
import butterknife.OnClick
import ms.messageapp.R


class DebugMenuActivity : VectorAppCompatActivity() {

    override fun getLayoutRes() = R.layout.activity_debug_menu

    @OnClick(R.id.debug_test_text_view_link)
    fun testTextViewLink() {
        startActivity(Intent(this, TestLinkifyActivity::class.java))
    }

}

