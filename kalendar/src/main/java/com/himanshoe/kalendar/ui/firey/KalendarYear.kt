package com.himanshoe.kalendar.ui.firey
/*
* MIT License
*
* Copyright (c) 2022 Himanshu Singh
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
* SOFTWARE.
*/

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.himanshoe.kalendar.common.KalendarSelector
import com.himanshoe.kalendar.common.YearRange
import com.himanshoe.kalendar.common.data.KalendarEvent
import com.himanshoe.kalendar.common.theme.Grid
import java.time.LocalDate
import java.time.YearMonth

@Composable
internal fun KalendarView(
    yearMonth: YearMonth = YearMonth.now(),
    selectedDay: LocalDate,
    yearRange: YearRange,
    kalendarSelector: KalendarSelector,
    kalendarEvents: List<KalendarEvent>,
    onCurrentDayClick: (LocalDate, KalendarEvent?) -> Unit,
    errorMessageLogged: (String) -> Unit,

    ) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Grid.Half)
    ) {
        KalendarMonth(
            selectedDay,
            yearMonth,
            yearRange,
            onCurrentDayClick,
            errorMessageLogged,
            kalendarSelector,
            kalendarEvents
        )
    }
}

