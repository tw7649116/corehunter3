/*--------------------------------------------------------------*/
/* Licensed to the Apache Software Foundation (ASF) under one   */
/* or more contributor license agreements.  See the NOTICE file */
/* distributed with this work for additional information        */
/* regarding copyright ownership.  The ASF licenses this file   */
/* to you under the Apache License, Version 2.0 (the            */
/* "License"); you may not use this file except in compliance   */
/* with the License.  You may obtain a copy of the License at   */
/*                                                              */
/*   http://www.apache.org/licenses/LICENSE-2.0                 */
/*                                                              */
/* Unless required by applicable law or agreed to in writing,   */
/* software distributed under the License is distributed on an  */
/* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       */
/* KIND, either express or implied.  See the License for the    */
/* specific language governing permissions and limitations      */
/* under the License.                                           */
/*--------------------------------------------------------------*/

package org.corehunter.objectives.multiallelic;

import org.jamesframework.core.problems.objectives.Objective;
import org.jamesframework.core.problems.objectives.evaluations.Evaluation;
import org.jamesframework.core.problems.objectives.evaluations.SimpleEvaluation;
import org.jamesframework.core.subset.SubsetSolution;
import org.corehunter.data.GenotypeVariantData;

/**
 * @author Guy Davenport
 */
public class CoverageMultiAllelic implements Objective<SubsetSolution, GenotypeVariantData> {

    private ProportionNonInformativeAllelesMultiAllelic pn;

    public CoverageMultiAllelic() {
        super();
        pn = new ProportionNonInformativeAllelesMultiAllelic();
    }

    /*
     * (non-Javadoc)
     * @see org.jamesframework.core.problems.objectives.Objective#evaluate(org.
     * jamesframework.core.problems.solutions.Solution, java.lang.Object)
     */
    @Override
    public Evaluation evaluate(SubsetSolution solution,
            GenotypeVariantData data) {
        return SimpleEvaluation.WITH_VALUE(1.0 - pn.evaluate(solution, data).getValue());
    }

    /*
     * (non-Javadoc)
     * @see org.jamesframework.core.problems.objectives.Objective#isMinimizing()
     */
    @Override
    public boolean isMinimizing() {
        return false;
    }
}