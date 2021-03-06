/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import static org.apache.storm.utils.Utils.tuple;

import java.util.Map;

import org.apache.storm.task.TopologyContext;
import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This bolt is used by the HBase example. It simply emits the first field
 * found in the incoming tuple as "word", with a "count" of `1`.
 * <p/>
 * In this case, the downstream HBase bolt handles the counting, so a value
 * of `1` will just increment the HBase counter by one.
 */
public class WordCounter extends BaseBasicBolt {
    private static final Logger LOG = LoggerFactory.getLogger(WordCounter.class);



    @Override
    public void prepare(Map topoConf, TopologyContext context) {
    }

    @Override
    public void execute(Tuple tuple, BasicOutputCollector basicOutputCollector) {
        basicOutputCollector.emit(tuple(tuple.getValues().get(0), 1));
    }

    /*
     * Just output the word value with a count of 1.
     * The HBaseBolt will handle incrementing the counter.
     */


    @Override
    public void cleanup() {

    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("word", "count"));
    }

    @Override
    public Map<String, Object> getComponentConfiguration() {
        return null;
    }

}