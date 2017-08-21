/*
 * Copyright 2016 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yixun.pettyloan.entity;

import android.support.annotation.NonNull;

/**
 * Created by zongkaili on 17-8-11.
 */

public class TradingRecord {

    public @NonNull
    String title;
    public @NonNull
    String time;
    public @NonNull
    String amount;


    public TradingRecord(@NonNull final String title, @NonNull final String time,@NonNull final String amount) {
        this.title = title;
        this.time = time;
        this.amount = amount;
    }
}