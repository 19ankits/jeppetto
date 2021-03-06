/*
 * Copyright (c) 2011-2017 Jeppetto and Jonathan Thompson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.iternine.jeppetto.dao.test.examples.forum;


import org.iternine.jeppetto.dao.GenericDAO;
import org.iternine.jeppetto.dao.Pair;

import java.util.Date;
import java.util.List;


/**
 */
public interface ReplyDAO extends GenericDAO<Reply, Pair<String, String>> {

    List<Reply> findByIdAndReplyDateGreaterThan(String id, Date oldestDate);

    List<Reply> findByIdAndReplyDateBetween(String id, Date oldestDate, Date newestDate);

    Iterable<Reply> findByIdAndLimit(String id, int limit);

    List<Reply> findByIdAndPostedBy(String id, String postedBy);

    List<Reply> findByIdOrderByReplyDateDesc(String id);

    List<Reply> findByIdOrderByPostedByAsc(String id);
}
