package com.hanlprpc;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import com.hankcs.hanlp.seg.common.Term;
import com.thriftrpc.hanlprpc.Segmenter;
import com.hankcs.hanlp.HanLP;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SegmenterHandler implements Segmenter.Iface {

  public List<Map<String, String>> seg(String text){
       List<Map<String, String>> result = new ArrayList<>();
       List<Term> terms = HanLP.segment(text);
       for (Term t: terms){
           HashMap<String, String> tmp = new HashMap<>();
           tmp.put("word", t.word.toString());
           tmp.put("nature", t.nature.toString());
           result.add(tmp);
       }
       return result;
  }
}

