/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.management.mbean;

import org.apache.camel.CamelContext;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.api.management.mbean.ManagedClaimCheckMBean;
import org.apache.camel.model.ExpressionNode;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.processor.ClaimCheckProcessor;

/**
 * @version 
 */
@ManagedResource(description = "Managed Claim Check")
public class ManagedClaimCheck extends ManagedProcessor implements ManagedClaimCheckMBean {
    private final ClaimCheckProcessor processor;

    public ManagedClaimCheck(CamelContext context, ClaimCheckProcessor processor, ProcessorDefinition<?> definition) {
        super(context, processor, definition);
        this.processor = processor;
    }

    @Override
    public ExpressionNode getDefinition() {
        return (ExpressionNode) super.getDefinition();
    }

    @Override
    public String getOperation() {
        return processor.getOperation();
    }

    @Override
    public String getKey() {
        return processor.getKey();
    }

    @Override
    public String getFilter() {
        return processor.getFilter();
    }
}
