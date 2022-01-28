package com.github.chiroruxx.fishplugin.completions

import com.github.chiroruxx.fishplugin.languages.FishTypes
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.patterns.PlatformPatterns
import com.intellij.util.ProcessingContext

class FishCompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(FishTypes.COMMAND),
            object : CompletionProvider<CompletionParameters>() {
                override fun addCompletions(
                    parameters: CompletionParameters,
                    context: ProcessingContext,
                    resultSet: CompletionResultSet
                ) {
                    for (command in getAllCommand()) {
                        resultSet.addElement(LookupElementBuilder.create(command))
                    }
                }
            }
        )
    }

    private fun getAllCommand(): Array<String> = arrayOf(
        "abbr",
        "alias",
        "and",
        "begin",
        "bg",
        "bind",
        "block",
        "break",
        "breakpoint",
        "builtin",
        "cd",
        "command",
        "commandline",
        "complete",
        "contains",
        "continue",
        "count",
        "dirh",
        "dirs",
        "echo",
        "else",
        "emit",
        "end",
        "eval",
        "exec",
        "exit",
        "false",
        "fg",
        "fish",
        "fish_config",
        "fish_indent",
        "fish_key_reader",
        "fish_mode_prompt",
        "fish_prompt",
        "fish_right_prompt",
        "fish_update_completions",
        "fish_vi_mode",
        "for",
        "funced",
        "funcsave",
        "function",
        "functions",
        "help",
        "history",
        "if",
        "isatty",
        "jobs",
        "math",
        "nextd",
        "open",
        "or",
        "popd",
        "prevd",
        "printf",
        "prompt_pwd",
        "psub",
        "pushd",
        "pwd",
        "random",
        "read",
        "realpath",
        "return",
        "set",
        "set_color",
        "source",
        "status",
        "string",
        "suspend",
        "switch",
        "test",
        "trap",
        "true",
        "type",
        "ulimit",
        "umask",
        "vared",
        "while",
    )
}
