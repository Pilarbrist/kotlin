/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/sourcemap")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SourceMapGenerationSmokeTestGenerated extends AbstractSourceMapGenerationSmokeTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest0(this::doTest, TargetBackend.JS, testDataFilePath);
    }

    public void testAllFilesPresentInSourcemap() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("js/js.translator/testData/sourcemap"), Pattern.compile("^([^_](.+))\\.kt$"), null, TargetBackend.JS, true);
    }

    @TestMetadata("binaryOperation.kt")
    public void testBinaryOperation() throws Exception {
        runTest("js/js.translator/testData/sourcemap/binaryOperation.kt");
    }

    @TestMetadata("emptyIfInsideInlineLambda.kt")
    public void testEmptyIfInsideInlineLambda() throws Exception {
        runTest("js/js.translator/testData/sourcemap/emptyIfInsideInlineLambda.kt");
    }

    @TestMetadata("expressionBody.kt")
    public void testExpressionBody() throws Exception {
        runTest("js/js.translator/testData/sourcemap/expressionBody.kt");
    }

    @TestMetadata("methodCallInMethod.kt")
    public void testMethodCallInMethod() throws Exception {
        runTest("js/js.translator/testData/sourcemap/methodCallInMethod.kt");
    }
}
