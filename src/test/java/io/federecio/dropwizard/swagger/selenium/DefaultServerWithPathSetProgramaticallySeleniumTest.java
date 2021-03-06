/**
 * Copyright (C) 2014 Federico Recio
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.federecio.dropwizard.swagger.selenium;

import io.federecio.dropwizard.junitrunner.DropwizardJunitRunner;
import io.federecio.dropwizard.junitrunner.DropwizardTestConfig;
import io.federecio.dropwizard.swagger.TestApplicationWithPathSetProgramatically;
import org.junit.runner.RunWith;

/**
 * @author Federico Recio
 */
@RunWith(DropwizardJunitRunner.class)
@DropwizardTestConfig(applicationClass = TestApplicationWithPathSetProgramatically.class, yamlFile = "/test-default-with-path-set-programatically.yaml")
public class DefaultServerWithPathSetProgramaticallySeleniumTest extends SeleniumTest {

    @Override
    protected String getSwaggerUrl() {
        return "http://localhost:33333/api/swagger";
    }
}
