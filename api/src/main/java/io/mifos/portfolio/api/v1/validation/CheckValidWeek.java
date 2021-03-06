/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.mifos.portfolio.api.v1.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Myrle Krantz
 */
@SuppressWarnings("WeakerAccess")
public class CheckValidWeek implements ConstraintValidator<ValidWeek, Integer> {
  @Override
  public void initialize(final ValidWeek constraintAnnotation) {

  }

  @Override
  public boolean isValid(final Integer value, final ConstraintValidatorContext context) {
    //TODO: remove allowance for 3 and 4 once UI is fixed to also not allow them.
    return value == null || value == 0 || value == 1 || value == 2 || value == 3 || value == 4 || value == -1;
  }
}
