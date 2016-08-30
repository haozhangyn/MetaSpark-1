/*
 * WorkingPara.scala for MetaSpark
 * Copyright (c) 2015-2016 Wei Zhou, Changchun Liu, Shuo Yuan All Rights Reserved.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.ynu.entity

/**
 * Created by spark on 15-1-16.
 */
class WorkingPara() {

  var taap = new Array[Int](256)
  var aap_begin = new Array[Int](256)
  var aap_list = new Array[Int](4000)
  var diag_score = new Array[Int](4000)

  def init() = {
    for (i <- 0 until 256) {
      this.taap(i) = 0
      this.aap_begin(i) = 0
    }

    for (i <- 0 until 4000) {
      this.aap_list(i) = 0
      this.diag_score(i) = 0
    }

  }


}