package org.activiti.crystalball.simulator;

/*
 * #%L
 * Activiti - CrystalBall
 * %%
 * Copyright (C) 2014 Alfresco
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


/**
 * This is basic interface for SimRun implementation
 * it allows to execute simulation without any break
 *
 * @author martin.grofcik
 */
public interface SimulationRun {

  /**
   * executes simulation run according to configuration already set
   * @throws Exception
   */
  void execute() throws Exception;

}
