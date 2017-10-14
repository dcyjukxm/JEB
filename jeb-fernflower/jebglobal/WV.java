package jebglobal;

import jebglobal.BT;
import jebglobal.vI;

public enum WV {
   dN("Controller should check for update on startup", "ctl_check_update", false, true),
   ld("Controller interface (address or hostname)", "ctl_interface", "", true),
   QE("Controller port", "ctl_port", BT.dN(), true),
   wU("Unix timestamp of the first time JEB was run", "first_run", 0),
   fa("Unix timestamp of the last time JEB was run", "last_run", 0),
   zs("Last version of JEB that was executed", "last_version_run", ""),
   mS("EULA accepted by the user", "eula_accepted", false),
   OK("License key", "license_key", ""),
   LH("Support has expired", "support_expired", false),
   KK("Shell width at startup", "shell_width", 1280),
   EO("Shell height at startup", "shell_height", 720),
   cb("Shell is maximized at startup", "shell_max", false),
   PF("Console width relative to the workspace area", "ui_w_console_ratio", 12),
   Hw("Selected tab index in Options dialog", "optdlg_selected_tab", 0),
   rK("Enable autorun on startup for plugins", "ui_plugin_autorun_allow", false),
   Ux("Plugins directory (custom actions)", "path_plugins", "plugins"),
   ZY("Signatures directory (library signatures)", "path_sigs", "sigs"),
   s("URL or path to Android SDK Javadoc", "path_javadoc", "http://developer.android.com/"),
   Hv("URL or path to Dalvik opcodes information", "path_dalvikdoc", "http://www.android-decompiler.com/help/dalvik-bytecode.html"),
   VX("Network proxy settings (type|address|port)", "proxy", "", true),
   ci("Check for update on startup", "check_update", true, true),
   bG("Check for update on startup (automation mode)", "check_update_auto", true, true),
   BQ("Check Java version on startup", "check_java", false),
   Ee("Compress database items", "compress_db", true),
   De("Auto-save database (timeout in minutes)", "db_autosave_timeout_minutes", 0),
   rn("Code font...", "code_font", ""),
   LR("Style manager...", "styles", "<default>"),
   Nh("Show inner classes by default", "classhier_showinner", false),
   XZ("Do not automatically expand these packages (regex)", "classhier_expandbl", "android"),
   nA("Visible rows in cross-references dialogs", "xref_rowcnt", 6),
   Ai("Parse the DEX file only", "apk_parse_dex_only", false, true),
   uM("Verify the certificates", "apk_verify", false, true),
   kq("Validate the DEX version number", "dex_check_version", false, true),
   ir("Validate checksum and signatures", "dex_check_hashes", false, true),
   rF("Validate access flags", "dex_check_access_flags", false, true),
   IL("Parse extended opcodes", "dex_parse_extended_opcodes", true, true),
   Db("Time-out before method decompilation fails (in seconds)", "decomp_method_timeout", 30, true),
   sC("Parse exception blocks (try-catch)", "decomp_parse_trycatches", true, true),
   jp("Aggressive substitutions", "decomp_aggressive_substitutions", true, true),
   bU("Generate identifier names from their types", "decomp_identname_from_type", false, true),
   Qg("Allow string concatenation", "decomp_ast_opt_string_concat", true, true),
   uB("Inline synthetic accessors", "decomp_ast_opt_inline_synth_access_calls", true, true),
   dY("Create for-loops", "decomp_ast_opt_create_for_loops", true, true),
   Rm("Create variable-arguments calls", "decomp_ast_opt_create_varargs", true, true),
   nb("Create multidimensional arrays instantiation", "decomp_ast_opt_create_multidimarrays", true, true),
   nI("Create conditional assignments", "decomp_ast_opt_create_condassigns", true, true),
   My("Disable interactivity if the method count exceeds the threshold", "asm_mthreshold_disable_interactivity", 20000),
   kU("Show bytecode", "asm_show_bytecode", false, true),
   mD("Show addresses", "asm_show_addresses", true, true),
   LV("Show annotations", "asm_show_annotations", true, true),
   uo("Show debug directives", "asm_show_debug", true, true),
   H("Show debug line numbers", "asm_show_linenums", false, true),
   go("Display parameter registers as pX", "asm_use_p_for_params", true, true),
   BP("Insert blank lines after basic blocks", "asm_insert_blanks", false, true),
   bL("Keep Smali compatibility", "asm_smali_compat", false, true),
   U("Add comments when integers look like resource IDs", "asm_comment_on_resid", true, true),
   xg("Character used to build class separators", "asm_separator_char", 45, true),
   Dx("Length of the class separator comment", "asm_separator_length", 80, true),
   qL("Word wrap lines (length)", "java_wordwrap_length", 100, true),
   kz("Generate numbers in hexadecimal", "java_numbers_hexa", false, true),
   lx("Port debug parameter names", "java_port_debug_param_names", true, true),
   cM("Display private methods last", "java_display_private_methods_last", false, true),
   Vq("Keep the \"this\" keyword (safer)", "java_keep_this", true),
   Dh("Keep the parentheses (safer)", "java_keep_parentheses", true, true),
   VV("Insert blank lines after compounds", "java_insert_blanks", true, true),
   LK("Generate synthetic fields", "java_gen_synth_fields", false, true),
   Mq("Generate synthetic methods", "java_gen_synth_methods", true, true),
   FY("Generate annotations", "java_gen_annotations", true, true),
   zE("Word wrap lines (length)", "xml_wordwrap_length", 0, true),
   vW("Item count warning threshold", "ui_itemcount_warning", 100);

   private String vi;
   private String l;
   private String WR;
   private vI NM;

   private WV(boolean var3, String var4, String var5, String var6, vI var7) {
      this.vi = var4;
      this.WR = var5;
      this.l = var6;
      this.NM = var7;
   }

   private WV(String var3, String var4, String var5) {
      this(false, var3, var4, var5, vI.QE);
   }

   private WV(String var3, String var4, int var5) {
      this(false, var3, var4, Integer.toString(var5), vI.ld);
   }

   private WV(String var3, String var4, boolean var5) {
      this(false, var3, var4, Boolean.toString(var5), vI.dN);
   }

   private WV(String var3, String var4, String var5, boolean var6) {
      this(var6, var3, var4, var5, vI.QE);
   }

   private WV(String var3, String var4, int var5, boolean var6) {
      this(var6, var3, var4, Integer.toString(var5), vI.ld);
   }

   private WV(String var3, String var4, boolean var5, boolean var6) {
      this(var6, var3, var4, Boolean.toString(var5), vI.dN);
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
