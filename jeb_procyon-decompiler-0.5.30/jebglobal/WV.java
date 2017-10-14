// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public enum WV
{
    dN("CTL_CHECK_UPDATE", 0, "Controller should check for update on startup", "ctl_check_update", false, true), 
    ld("CTL_INTERFACE", 1, "Controller interface (address or hostname)", "ctl_interface", "", true), 
    QE("CTL_PORT", 2, "Controller port", "ctl_port", BT.dN(), true), 
    wU("FIRST_RUN", 3, "Unix timestamp of the first time JEB was run", "first_run", 0), 
    fa("LAST_RUN", 4, "Unix timestamp of the last time JEB was run", "last_run", 0), 
    zs("LAST_VERSION_RUN", 5, "Last version of JEB that was executed", "last_version_run", ""), 
    mS("EULA_ACCEPTED", 6, "EULA accepted by the user", "eula_accepted", false), 
    OK("LICENSE_KEY", 7, "License key", "license_key", ""), 
    LH("SUPPORT_EXPIRED", 8, "Support has expired", "support_expired", false), 
    KK("UI_SHELL_WIDTH", 9, "Shell width at startup", "shell_width", 1280), 
    EO("UI_SHELL_HEIGHT", 10, "Shell height at startup", "shell_height", 720), 
    cb("UI_SHELL_MAX", 11, "Shell is maximized at startup", "shell_max", false), 
    PF("UI_WORKSPACE_CONSOLE_RATIO", 12, "Console width relative to the workspace area", "ui_w_console_ratio", 12), 
    Hw("UI_OPTDLG_SELECTED_TAB", 13, "Selected tab index in Options dialog", "optdlg_selected_tab", 0), 
    rK("UI_PLUGIN_ALLOW_AUTORUN", 14, "Enable autorun on startup for plugins", "ui_plugin_autorun_allow", false), 
    Ux("PATH_PLUGINS", 15, "Plugins directory (custom actions)", "path_plugins", "plugins"), 
    ZY("PATH_SIGS", 16, "Signatures directory (library signatures)", "path_sigs", "sigs"), 
    s("PATH_JAVADOC", 17, "URL or path to Android SDK Javadoc", "path_javadoc", "http://developer.android.com/"), 
    Hv("PATH_DALVIKDOC", 18, "URL or path to Dalvik opcodes information", "path_dalvikdoc", "http://www.android-decompiler.com/help/dalvik-bytecode.html"), 
    VX("NETWORK_PROXY", 19, "Network proxy settings (type|address|port)", "proxy", "", true), 
    ci("CHECK_UPDATE", 20, "Check for update on startup", "check_update", true, true), 
    bG("CHECK_UPDATE_AUTO", 21, "Check for update on startup (automation mode)", "check_update_auto", true, true), 
    BQ("CHECK_JAVA", 22, "Check Java version on startup", "check_java", false), 
    Ee("DB_COMPRESS", 23, "Compress database items", "compress_db", true), 
    De("DB_AUTOSAVE_TIMEOUT_MINUTES", 24, "Auto-save database (timeout in minutes)", "db_autosave_timeout_minutes", 0), 
    rn("UI_CODE_FONT", 25, "Code font...", "code_font", ""), 
    LR("UI_STYLE_MANAGER", 26, "Style manager...", "styles", "<default>"), 
    Nh("UI_CLASSHIER_SHOW_INNER", 27, "Show inner classes by default", "classhier_showinner", false), 
    XZ("UI_CLASSHIER_EXPAND_BLACKLIST", 28, "Do not automatically expand these packages (regex)", "classhier_expandbl", "android"), 
    nA("UI_XREF_COUNT", 29, "Visible rows in cross-references dialogs", "xref_rowcnt", 6), 
    Ai("APK_PARSE_DEX_ONLY", 30, "Parse the DEX file only", "apk_parse_dex_only", false, true), 
    uM("APK_VERIFY", 31, "Verify the certificates", "apk_verify", false, true), 
    kq("DEX_CHECK_VERSION", 32, "Validate the DEX version number", "dex_check_version", false, true), 
    ir("DEX_CHECK_HASHES", 33, "Validate checksum and signatures", "dex_check_hashes", false, true), 
    rF("DEX_CHECK_ACCESS_FLAGS", 34, "Validate access flags", "dex_check_access_flags", false, true), 
    IL("DEX_PARSE_EXTENDED_OPCODES", 35, "Parse extended opcodes", "dex_parse_extended_opcodes", true, true), 
    Db("DECOMP_METHOD_TIMEOUT", 36, "Time-out before method decompilation fails (in seconds)", "decomp_method_timeout", 30, true), 
    sC("DECOMP_PARSE_TRYCATCHES", 37, "Parse exception blocks (try-catch)", "decomp_parse_trycatches", true, true), 
    jp("DECOMP_OPT_AGGRESSIVE_SUBSTITUTIONS", 38, "Aggressive substitutions", "decomp_aggressive_substitutions", true, true), 
    bU("DECOMP_AST_IDENTNAME_FROM_TYPE", 39, "Generate identifier names from their types", "decomp_identname_from_type", false, true), 
    Qg("DECOMP_AST_OPT_STRING_CONCAT", 40, "Allow string concatenation", "decomp_ast_opt_string_concat", true, true), 
    uB("DECOMP_AST_OPT_INLINE_SYNTH_ACCESSORS", 41, "Inline synthetic accessors", "decomp_ast_opt_inline_synth_access_calls", true, true), 
    dY("DECOMP_AST_OPT_CREATE_FOR_LOOPS", 42, "Create for-loops", "decomp_ast_opt_create_for_loops", true, true), 
    Rm("DECOMP_AST_OPT_CREATE_VARARGS", 43, "Create variable-arguments calls", "decomp_ast_opt_create_varargs", true, true), 
    nb("DECOMP_AST_OPT_CREATE_MULTIDIMARRAYS", 44, "Create multidimensional arrays instantiation", "decomp_ast_opt_create_multidimarrays", true, true), 
    nI("DECOMP_AST_OPT_CREATE_CONDASSIGNS", 45, "Create conditional assignments", "decomp_ast_opt_create_condassigns", true, true), 
    My("UI_ASM_MTHRESHOLD_DISABLE_INTERACTIVITY", 46, "Disable interactivity if the method count exceeds the threshold", "asm_mthreshold_disable_interactivity", 20000), 
    kU("ASM_SHOW_BYTECODE", 47, "Show bytecode", "asm_show_bytecode", false, true), 
    mD("ASM_SHOW_ADDRESSES", 48, "Show addresses", "asm_show_addresses", true, true), 
    LV("ASM_SHOW_ANNOTATIONS", 49, "Show annotations", "asm_show_annotations", true, true), 
    uo("ASM_SHOW_DEBUG", 50, "Show debug directives", "asm_show_debug", true, true), 
    H("ASM_SHOW_LINENUMS", 51, "Show debug line numbers", "asm_show_linenums", false, true), 
    go("ASM_USE_P_FOR_PARAMS", 52, "Display parameter registers as pX", "asm_use_p_for_params", true, true), 
    BP("ASM_INSERT_BLANKS", 53, "Insert blank lines after basic blocks", "asm_insert_blanks", false, true), 
    bL("ASM_KEEP_SMALI_COMPAT", 54, "Keep Smali compatibility", "asm_smali_compat", false, true), 
    U("ASM_COMMENT_ON_RESID", 55, "Add comments when integers look like resource IDs", "asm_comment_on_resid", true, true), 
    xg("ASM_SEPARATOR_CHAR", 56, "Character used to build class separators", "asm_separator_char", 45, true), 
    Dx("ASM_SEPARATOR_LENGTH", 57, "Length of the class separator comment", "asm_separator_length", 80, true), 
    qL("JAVA_WORDWRAP_LENGTH", 58, "Word wrap lines (length)", "java_wordwrap_length", 100, true), 
    kz("JAVA_GENERATE_IN_HEX", 59, "Generate numbers in hexadecimal", "java_numbers_hexa", false, true), 
    lx("JAVA_PORT_DEBUG_PARAM_NAMES", 60, "Port debug parameter names", "java_port_debug_param_names", true, true), 
    cM("JAVA_DISPLAY_PRIVATE_METHODS_LAST", 61, "Display private methods last", "java_display_private_methods_last", false, true), 
    Vq("JAVA_KEEP_THIS", 62, "Keep the \"this\" keyword (safer)", "java_keep_this", true), 
    Dh("JAVA_KEEP_PARENTHESES", 63, "Keep the parentheses (safer)", "java_keep_parentheses", true, true), 
    VV("JAVA_INSERT_BLANKS", 64, "Insert blank lines after compounds", "java_insert_blanks", true, true), 
    LK("JAVA_GENERATE_SYNTHETIC_FIELDS", 65, "Generate synthetic fields", "java_gen_synth_fields", false, true), 
    Mq("JAVA_GENERATE_SYNTHETIC_METHODS", 66, "Generate synthetic methods", "java_gen_synth_methods", true, true), 
    FY("JAVA_GENERATE_ANNOTATIONS", 67, "Generate annotations", "java_gen_annotations", true, true), 
    zE("XML_WORDWRAP_LENGTH", 68, "Word wrap lines (length)", "xml_wordwrap_length", 0, true), 
    vW("UI_ITEMCOUNT_WARNING_THRESHOLD", 69, "Item count warning threshold", "ui_itemcount_warning", 100);
    
    private String vi;
    private String l;
    private String WR;
    private vI NM;
    
    private WV(final String s, final int n, final boolean b, final String vi, final String wr, final String l, final vI nm) {
        this.vi = vi;
        this.WR = wr;
        this.l = l;
        this.NM = nm;
    }
    
    private WV(final String s, final int n, final String s2, final String s3, final String s4) {
        this(s, n, false, s2, s3, s4, vI.QE);
    }
    
    private WV(final String s, final int n, final String s2, final String s3, final int n2) {
        this(s, n, false, s2, s3, Integer.toString(n2), vI.ld);
    }
    
    private WV(final String s, final int n, final String s2, final String s3, final boolean b) {
        this(s, n, false, s2, s3, Boolean.toString(b), vI.dN);
    }
    
    private WV(final String s, final int n, final String s2, final String s3, final String s4, final boolean b) {
        this(s, n, b, s2, s3, s4, vI.QE);
    }
    
    private WV(final String s, final int n, final String s2, final String s3, final int n2, final boolean b) {
        this(s, n, b, s2, s3, Integer.toString(n2), vI.ld);
    }
    
    private WV(final String s, final int n, final String s2, final String s3, final boolean b, final boolean b2) {
        this(s, n, b2, s2, s3, Boolean.toString(b), vI.dN);
    }
    
    public String dN() {
        return this.vi;
    }
    
    public String ld() {
        return this.WR;
    }
    
    public String QE() {
        return this.l;
    }
    
    public vI wU() {
        return this.NM;
    }
}
