package jeb.api.dex;

public class DexDalvikInstructionSet {
   public static final int OP_NOP = 0;
   public static final int OP_MOVE = 1;
   public static final int OP_MOVE_FROM_16 = 2;
   public static final int OP_MOVE_16 = 3;
   public static final int OP_MOVE_WIDE = 4;
   public static final int OP_MOVE_WIDE_FROM_16 = 5;
   public static final int OP_MOVE_WIDE_16 = 6;
   public static final int OP_MOVE_OBJECT = 7;
   public static final int OP_MOVE_OBJECT_FROM_16 = 8;
   public static final int OP_MOVE_OBJECT_16 = 9;
   public static final int OP_MOVE_RESULT = 10;
   public static final int OP_MOVE_RESULT_WIDE = 11;
   public static final int OP_MOVE_RESULT_OBJECT = 12;
   public static final int OP_MOVE_EXCEPTION = 13;
   public static final int OP_RETURN_VOID = 14;
   public static final int OP_RETURN = 15;
   public static final int OP_RETURN_WIDE = 16;
   public static final int OP_RETURN_OBJECT = 17;
   public static final int OP_CONST_4 = 18;
   public static final int OP_CONST_16 = 19;
   public static final int OP_CONST = 20;
   public static final int OP_CONST_HIGH16 = 21;
   public static final int OP_CONST_WIDE_16 = 22;
   public static final int OP_CONST_WIDE_32 = 23;
   public static final int OP_CONST_WIDE = 24;
   public static final int OP_CONST_WIDE_HIGH16 = 25;
   public static final int OP_CONST_STRING = 26;
   public static final int OP_CONST_STRING_JUMBO = 27;
   public static final int OP_CONST_CLASS = 28;
   public static final int OP_MONITOR_ENTER = 29;
   public static final int OP_MONITOR_EXIT = 30;
   public static final int OP_CHECK_CAST = 31;
   public static final int OP_INSTANCE_OF = 32;
   public static final int OP_ARRAY_LENGTH = 33;
   public static final int OP_NEW_INSTANCE = 34;
   public static final int OP_NEW_ARRAY = 35;
   public static final int OP_FILLED_NEW_ARRAY = 36;
   public static final int OP_FILLED_NEW_ARRAY_RANGE = 37;
   public static final int OP_FILL_ARRAY_DATA = 38;
   public static final int OP_THROW = 39;
   public static final int OP_GOTO = 40;
   public static final int OP_GOTO_16 = 41;
   public static final int OP_GOTO_32 = 42;
   public static final int OP_PACKED_SWITCH = 43;
   public static final int OP_SPARSE_SWITCH = 44;
   public static final int OP_CMPL_FLOAT = 45;
   public static final int OP_CMPG_FLOAT = 46;
   public static final int OP_CMPL_DOUBLE = 47;
   public static final int OP_CMPG_DOUBLE = 48;
   public static final int OP_CMP_LONG = 49;
   public static final int OP_IF_EQ = 50;
   public static final int OP_IF_NE = 51;
   public static final int OP_IF_LT = 52;
   public static final int OP_IF_GE = 53;
   public static final int OP_IF_GT = 54;
   public static final int OP_IF_LE = 55;
   public static final int OP_IF_EQZ = 56;
   public static final int OP_IF_NEZ = 57;
   public static final int OP_IF_LTZ = 58;
   public static final int OP_IF_GEZ = 59;
   public static final int OP_IF_GTZ = 60;
   public static final int OP_IF_LEZ = 61;
   public static final int OP_AGET = 68;
   public static final int OP_AGET_WIDE = 69;
   public static final int OP_AGET_OBJECT = 70;
   public static final int OP_AGET_BOOLEAN = 71;
   public static final int OP_AGET_BYTE = 72;
   public static final int OP_AGET_CHAR = 73;
   public static final int OP_AGET_SHORT = 74;
   public static final int OP_APUT = 75;
   public static final int OP_APUT_WIDE = 76;
   public static final int OP_APUT_OBJECT = 77;
   public static final int OP_APUT_BOOLEAN = 78;
   public static final int OP_APUT_BYTE = 79;
   public static final int OP_APUT_CHAR = 80;
   public static final int OP_APUT_SHORT = 81;
   public static final int OP_IGET = 82;
   public static final int OP_IGET_WIDE = 83;
   public static final int OP_IGET_OBJECT = 84;
   public static final int OP_IGET_BOOLEAN = 85;
   public static final int OP_IGET_BYTE = 86;
   public static final int OP_IGET_CHAR = 87;
   public static final int OP_IGET_SHORT = 88;
   public static final int OP_IPUT = 89;
   public static final int OP_IPUT_WIDE = 90;
   public static final int OP_IPUT_OBJECT = 91;
   public static final int OP_IPUT_BOOLEAN = 92;
   public static final int OP_IPUT_BYTE = 93;
   public static final int OP_IPUT_CHAR = 94;
   public static final int OP_IPUT_SHORT = 95;
   public static final int OP_SGET = 96;
   public static final int OP_SGET_WIDE = 97;
   public static final int OP_SGET_OBJECT = 98;
   public static final int OP_SGET_BOOLEAN = 99;
   public static final int OP_SGET_BYTE = 100;
   public static final int OP_SGET_CHAR = 101;
   public static final int OP_SGET_SHORT = 102;
   public static final int OP_SPUT = 103;
   public static final int OP_SPUT_WIDE = 104;
   public static final int OP_SPUT_OBJECT = 105;
   public static final int OP_SPUT_BOOLEAN = 106;
   public static final int OP_SPUT_BYTE = 107;
   public static final int OP_SPUT_CHAR = 108;
   public static final int OP_SPUT_SHORT = 109;
   public static final int OP_INVOKE_VIRTUAL = 110;
   public static final int OP_INVOKE_SUPER = 111;
   public static final int OP_INVOKE_DIRECT = 112;
   public static final int OP_INVOKE_STATIC = 113;
   public static final int OP_INVOKE_INTERFACE = 114;
   public static final int OP_INVOKE_VIRTUAL_RANGE = 116;
   public static final int OP_INVOKE_SUPER_RANGE = 117;
   public static final int OP_INVOKE_DIRECT_RANGE = 118;
   public static final int OP_INVOKE_STATIC_RANGE = 119;
   public static final int OP_INVOKE_INTERFACE_RANGE = 120;
   public static final int OP_NEG_INT = 123;
   public static final int OP_NOT_INT = 124;
   public static final int OP_NEG_LONG = 125;
   public static final int OP_NOT_LONG = 126;
   public static final int OP_NEG_FLOAT = 127;
   public static final int OP_NEG_DOUBLE = 128;
   public static final int OP_INT_TO_LONG = 129;
   public static final int OP_INT_TO_FLOAT = 130;
   public static final int OP_INT_TO_DOUBLE = 131;
   public static final int OP_LONG_TO_INT = 132;
   public static final int OP_LONG_TO_FLOAT = 133;
   public static final int OP_LONG_TO_DOUBLE = 134;
   public static final int OP_FLOAT_TO_INT = 135;
   public static final int OP_FLOAT_TO_LONG = 136;
   public static final int OP_FLOAT_TO_DOUBLE = 137;
   public static final int OP_DOUBLE_TO_INT = 138;
   public static final int OP_DOUBLE_TO_LONG = 139;
   public static final int OP_DOUBLE_TO_FLOAT = 140;
   public static final int OP_INT_TO_BYTE = 141;
   public static final int OP_INT_TO_CHAR = 142;
   public static final int OP_INT_TO_SHORT = 143;
   public static final int OP_ADD_INT = 144;
   public static final int OP_SUB_INT = 145;
   public static final int OP_MUL_INT = 146;
   public static final int OP_DIV_INT = 147;
   public static final int OP_REM_INT = 148;
   public static final int OP_AND_INT = 149;
   public static final int OP_OR_INT = 150;
   public static final int OP_XOR_INT = 151;
   public static final int OP_SHL_INT = 152;
   public static final int OP_SHR_INT = 153;
   public static final int OP_USHR_INT = 154;
   public static final int OP_ADD_LONG = 155;
   public static final int OP_SUB_LONG = 156;
   public static final int OP_MUL_LONG = 157;
   public static final int OP_DIV_LONG = 158;
   public static final int OP_REM_LONG = 159;
   public static final int OP_AND_LONG = 160;
   public static final int OP_OR_LONG = 161;
   public static final int OP_XOR_LONG = 162;
   public static final int OP_SHL_LONG = 163;
   public static final int OP_SHR_LONG = 164;
   public static final int OP_USHR_LONG = 165;
   public static final int OP_ADD_FLOAT = 166;
   public static final int OP_SUB_FLOAT = 167;
   public static final int OP_MUL_FLOAT = 168;
   public static final int OP_DIV_FLOAT = 169;
   public static final int OP_REM_FLOAT = 170;
   public static final int OP_ADD_DOUBLE = 171;
   public static final int OP_SUB_DOUBLE = 172;
   public static final int OP_MUL_DOUBLE = 173;
   public static final int OP_DIV_DOUBLE = 174;
   public static final int OP_REM_DOUBLE = 175;
   public static final int OP_ADD_INT_2ADDR = 176;
   public static final int OP_SUB_INT_2ADDR = 177;
   public static final int OP_MUL_INT_2ADDR = 178;
   public static final int OP_DIV_INT_2ADDR = 179;
   public static final int OP_REM_INT_2ADDR = 180;
   public static final int OP_AND_INT_2ADDR = 181;
   public static final int OP_OR_INT_2ADDR = 182;
   public static final int OP_XOR_INT_2ADDR = 183;
   public static final int OP_SHL_INT_2ADDR = 184;
   public static final int OP_SHR_INT_2ADDR = 185;
   public static final int OP_USHR_INT_2ADDR = 186;
   public static final int OP_ADD_LONG_2ADDR = 187;
   public static final int OP_SUB_LONG_2ADDR = 188;
   public static final int OP_MUL_LONG_2ADDR = 189;
   public static final int OP_DIV_LONG_2ADDR = 190;
   public static final int OP_REM_LONG_2ADDR = 191;
   public static final int OP_AND_LONG_2ADDR = 192;
   public static final int OP_OR_LONG_2ADDR = 193;
   public static final int OP_XOR_LONG_2ADDR = 194;
   public static final int OP_SHL_LONG_2ADDR = 195;
   public static final int OP_SHR_LONG_2ADDR = 196;
   public static final int OP_USHR_LONG_2ADDR = 197;
   public static final int OP_ADD_FLOAT_2ADDR = 198;
   public static final int OP_SUB_FLOAT_2ADDR = 199;
   public static final int OP_MUL_FLOAT_2ADDR = 200;
   public static final int OP_DIV_FLOAT_2ADDR = 201;
   public static final int OP_REM_FLOAT_2ADDR = 202;
   public static final int OP_ADD_DOUBLE_2ADDR = 203;
   public static final int OP_SUB_DOUBLE_2ADDR = 204;
   public static final int OP_MUL_DOUBLE_2ADDR = 205;
   public static final int OP_DIV_DOUBLE_2ADDR = 206;
   public static final int OP_REM_DOUBLE_2ADDR = 207;
   public static final int OP_ADD_INT_LIT16 = 208;
   public static final int OP_RSUB_INT = 209;
   public static final int OP_MUL_INT_LIT16 = 210;
   public static final int OP_DIV_INT_LIT16 = 211;
   public static final int OP_REM_INT_LIT16 = 212;
   public static final int OP_AND_INT_LIT16 = 213;
   public static final int OP_OR_INT_LIT16 = 214;
   public static final int OP_XOR_INT_LIT16 = 215;
   public static final int OP_ADD_INT_LIT8 = 216;
   public static final int OP_RSUB_INT_LIT8 = 217;
   public static final int OP_MUL_INT_LIT8 = 218;
   public static final int OP_DIV_INT_LIT8 = 219;
   public static final int OP_REM_INT_LIT8 = 220;
   public static final int OP_AND_INT_LIT8 = 221;
   public static final int OP_OR_INT_LIT8 = 222;
   public static final int OP_XOR_INT_LIT8 = 223;
   public static final int OP_SHL_INT_LIT8 = 224;
   public static final int OP_SHR_INT_LIT8 = 225;
   public static final int OP_USHR_INT_LIT8 = 226;
   public static final int OP_CONST_CLASS_JUMBO = 255;
   public static final int OP_CHECK_CAST_JUMBO = 511;
   public static final int OP_INSTANCE_OF_JUMBO = 767;
   public static final int OP_NEW_INSTANCE_JUMBO = 1023;
   public static final int OP_NEW_ARRAY_JUMBO = 1279;
   public static final int OP_FILLED_NEW_ARRAY_JUMBO = 1535;
   public static final int OP_IGET_JUMBO = 1791;
   public static final int OP_IGET_WIDE_JUMBO = 2047;
   public static final int OP_IGET_OBJECT_JUMBO = 2303;
   public static final int OP_IGET_BOOLEAN_JUMBO = 2559;
   public static final int OP_IGET_BYTE_JUMBO = 2815;
   public static final int OP_IGET_CHAR_JUMBO = 3071;
   public static final int OP_IGET_SHORT_JUMBO = 3327;
   public static final int OP_IPUT_JUMBO = 3583;
   public static final int OP_IPUT_WIDE_JUMBO = 3839;
   public static final int OP_IPUT_OBJECT_JUMBO = 4095;
   public static final int OP_IPUT_BOOLEAN_JUMBO = 4351;
   public static final int OP_IPUT_BYTE_JUMBO = 4607;
   public static final int OP_IPUT_CHAR_JUMBO = 4863;
   public static final int OP_IPUT_SHORT_JUMBO = 5119;
   public static final int OP_SGET_JUMBO = 5375;
   public static final int OP_SGET_WIDE_JUMBO = 5631;
   public static final int OP_SGET_OBJECT_JUMBO = 5887;
   public static final int OP_SGET_BOOLEAN_JUMBO = 6143;
   public static final int OP_SGET_BYTE_JUMBO = 6399;
   public static final int OP_SGET_CHAR_JUMBO = 6655;
   public static final int OP_SGET_SHORT_JUMBO = 6911;
   public static final int OP_SPUT_JUMBO = 7167;
   public static final int OP_SPUT_WIDE_JUMBO = 7423;
   public static final int OP_SPUT_OBJECT_JUMBO = 7679;
   public static final int OP_SPUT_BOOLEAN_JUMBO = 7935;
   public static final int OP_SPUT_BYTE_JUMBO = 8191;
   public static final int OP_SPUT_CHAR_JUMBO = 8447;
   public static final int OP_SPUT_SHORT_JUMBO = 8703;
   public static final int OP_INVOKE_VIRTUAL_JUMBO = 8959;
   public static final int OP_INVOKE_SUPER_JUMBO = 9215;
   public static final int OP_INVOKE_DIRECT_JUMBO = 9471;
   public static final int OP_INVOKE_STATIC_JUMBO = 9727;
   public static final int OP_INVOKE_INTERFACE_JUMBO = 9983;
   static final DexDalvikInstructionSet.InsnDef[] set = new DexDalvikInstructionSet.InsnDef[]{new DexDalvikInstructionSet.InsnDef(0, "10x", 0, "nop"), new DexDalvikInstructionSet.InsnDef(1, "12x", 18, "move"), new DexDalvikInstructionSet.InsnDef(2, "22x", 18, "move/from16"), new DexDalvikInstructionSet.InsnDef(3, "32x", 18, "move/16"), new DexDalvikInstructionSet.InsnDef(4, "12x", 4608, "move-wide"), new DexDalvikInstructionSet.InsnDef(5, "22x", 4608, "move-wide/from16"), new DexDalvikInstructionSet.InsnDef(6, "32x", 4608, "move-wide/16"), new DexDalvikInstructionSet.InsnDef(7, "12x", 18, "move-object"), new DexDalvikInstructionSet.InsnDef(8, "22x", 18, "move-object/from16"), new DexDalvikInstructionSet.InsnDef(9, "32x", 18, "move-object/16"), new DexDalvikInstructionSet.InsnDef(10, "11x", 16, "move-result"), new DexDalvikInstructionSet.InsnDef(11, "11x", 4096, "move-result-wide"), new DexDalvikInstructionSet.InsnDef(12, "11x", 16, "move-result-object"), new DexDalvikInstructionSet.InsnDef(13, "11x", 16, "move-exception"), new DexDalvikInstructionSet.InsnDef(14, "10x", 0, "return-void"), new DexDalvikInstructionSet.InsnDef(15, "11x", 1, "return"), new DexDalvikInstructionSet.InsnDef(16, "11x", 256, "return-wide"), new DexDalvikInstructionSet.InsnDef(17, "11x", 1, "return-object"), new DexDalvikInstructionSet.InsnDef(18, "11n", 16, "const/4"), new DexDalvikInstructionSet.InsnDef(19, "21s", 16, "const/16"), new DexDalvikInstructionSet.InsnDef(20, "31i", 16, "const"), new DexDalvikInstructionSet.InsnDef(21, "21h", 16, "const/high16"), new DexDalvikInstructionSet.InsnDef(22, "21s", 4096, "const-wide/16"), new DexDalvikInstructionSet.InsnDef(23, "31i", 4096, "const-wide/32"), new DexDalvikInstructionSet.InsnDef(24, "51l", 4096, "const-wide"), new DexDalvikInstructionSet.InsnDef(25, "21h", 4096, "const-wide/high16"), new DexDalvikInstructionSet.InsnDef(26, "21c", 16, "const-string"), new DexDalvikInstructionSet.InsnDef(27, "31c", 16, "const-string/jumbo"), new DexDalvikInstructionSet.InsnDef(28, "21c", 16, "const-class"), new DexDalvikInstructionSet.InsnDef(29, "11x", 1, "monitor-enter"), new DexDalvikInstructionSet.InsnDef(30, "11x", 1, "monitor-exit"), new DexDalvikInstructionSet.InsnDef(31, "21c", 1, "check-cast"), new DexDalvikInstructionSet.InsnDef(32, "22c", 18, "instance-of"), new DexDalvikInstructionSet.InsnDef(33, "12x", 18, "array-length"), new DexDalvikInstructionSet.InsnDef(34, "21c", 16, "new-instance"), new DexDalvikInstructionSet.InsnDef(35, "22c", 18, "new-array"), new DexDalvikInstructionSet.InsnDef(36, "35c", 65536, "filled-new-array"), new DexDalvikInstructionSet.InsnDef(37, "3rc", 65536, "filled-new-array/range"), new DexDalvikInstructionSet.InsnDef(38, "31t", 1, "fill-array-data"), new DexDalvikInstructionSet.InsnDef(39, "11x", 1, "throw"), new DexDalvikInstructionSet.InsnDef(40, "10t", 0, "goto"), new DexDalvikInstructionSet.InsnDef(41, "20t", 0, "goto/16"), new DexDalvikInstructionSet.InsnDef(42, "30t", 0, "goto/32"), new DexDalvikInstructionSet.InsnDef(43, "31t", 1, "packed-switch"), new DexDalvikInstructionSet.InsnDef(44, "31t", 1, "sparse-switch"), new DexDalvikInstructionSet.InsnDef(45, "23x", 22, "cmpl-float"), new DexDalvikInstructionSet.InsnDef(46, "23x", 22, "cmpg-float"), new DexDalvikInstructionSet.InsnDef(47, "23x", 1552, "cmpl-double"), new DexDalvikInstructionSet.InsnDef(48, "23x", 1552, "cmpg-double"), new DexDalvikInstructionSet.InsnDef(49, "23x", 1552, "cmp-long"), new DexDalvikInstructionSet.InsnDef(50, "22t", 3, "if-eq"), new DexDalvikInstructionSet.InsnDef(51, "22t", 3, "if-ne"), new DexDalvikInstructionSet.InsnDef(52, "22t", 3, "if-lt"), new DexDalvikInstructionSet.InsnDef(53, "22t", 3, "if-ge"), new DexDalvikInstructionSet.InsnDef(54, "22t", 3, "if-gt"), new DexDalvikInstructionSet.InsnDef(55, "22t", 3, "if-le"), new DexDalvikInstructionSet.InsnDef(56, "21t", 1, "if-eqz"), new DexDalvikInstructionSet.InsnDef(57, "21t", 1, "if-nez"), new DexDalvikInstructionSet.InsnDef(58, "21t", 1, "if-ltz"), new DexDalvikInstructionSet.InsnDef(59, "21t", 1, "if-gez"), new DexDalvikInstructionSet.InsnDef(60, "21t", 1, "if-gtz"), new DexDalvikInstructionSet.InsnDef(61, "21t", 1, "if-lez"), new DexDalvikInstructionSet.InsnDef(62, "10x"), new DexDalvikInstructionSet.InsnDef(63, "10x"), new DexDalvikInstructionSet.InsnDef(64, "10x"), new DexDalvikInstructionSet.InsnDef(65, "10x"), new DexDalvikInstructionSet.InsnDef(66, "10x"), new DexDalvikInstructionSet.InsnDef(67, "10x"), new DexDalvikInstructionSet.InsnDef(68, "23x", 22, "aget"), new DexDalvikInstructionSet.InsnDef(69, "23x", 4102, "aget-wide"), new DexDalvikInstructionSet.InsnDef(70, "23x", 22, "aget-object"), new DexDalvikInstructionSet.InsnDef(71, "23x", 22, "aget-boolean"), new DexDalvikInstructionSet.InsnDef(72, "23x", 22, "aget-byte"), new DexDalvikInstructionSet.InsnDef(73, "23x", 22, "aget-char"), new DexDalvikInstructionSet.InsnDef(74, "23x", 22, "aget-short"), new DexDalvikInstructionSet.InsnDef(75, "23x", 7, "aput"), new DexDalvikInstructionSet.InsnDef(76, "23x", 262, "aput-wide"), new DexDalvikInstructionSet.InsnDef(77, "23x", 7, "aput-object"), new DexDalvikInstructionSet.InsnDef(78, "23x", 7, "aput-boolean"), new DexDalvikInstructionSet.InsnDef(79, "23x", 7, "aput-byte"), new DexDalvikInstructionSet.InsnDef(80, "23x", 7, "aput-char"), new DexDalvikInstructionSet.InsnDef(81, "23x", 7, "aput-short"), new DexDalvikInstructionSet.InsnDef(82, "22c", 18, "iget"), new DexDalvikInstructionSet.InsnDef(83, "22c", 4098, "iget-wide"), new DexDalvikInstructionSet.InsnDef(84, "22c", 18, "iget-object"), new DexDalvikInstructionSet.InsnDef(85, "22c", 18, "iget-boolean"), new DexDalvikInstructionSet.InsnDef(86, "22c", 18, "iget-byte"), new DexDalvikInstructionSet.InsnDef(87, "22c", 18, "iget-char"), new DexDalvikInstructionSet.InsnDef(88, "22c", 18, "iget-short"), new DexDalvikInstructionSet.InsnDef(89, "22c", 3, "iput"), new DexDalvikInstructionSet.InsnDef(90, "22c", 258, "iput-wide"), new DexDalvikInstructionSet.InsnDef(91, "22c", 3, "iput-object"), new DexDalvikInstructionSet.InsnDef(92, "22c", 3, "iput-boolean"), new DexDalvikInstructionSet.InsnDef(93, "22c", 3, "iput-byte"), new DexDalvikInstructionSet.InsnDef(94, "22c", 3, "iput-char"), new DexDalvikInstructionSet.InsnDef(95, "22c", 3, "iput-short"), new DexDalvikInstructionSet.InsnDef(96, "21c", 16, "sget"), new DexDalvikInstructionSet.InsnDef(97, "21c", 4096, "sget-wide"), new DexDalvikInstructionSet.InsnDef(98, "21c", 16, "sget-object"), new DexDalvikInstructionSet.InsnDef(99, "21c", 16, "sget-boolean"), new DexDalvikInstructionSet.InsnDef(100, "21c", 16, "sget-byte"), new DexDalvikInstructionSet.InsnDef(101, "21c", 16, "sget-char"), new DexDalvikInstructionSet.InsnDef(102, "21c", 16, "sget-short"), new DexDalvikInstructionSet.InsnDef(103, "21c", 1, "sput"), new DexDalvikInstructionSet.InsnDef(104, "21c", 256, "sput-wide"), new DexDalvikInstructionSet.InsnDef(105, "21c", 1, "sput-object"), new DexDalvikInstructionSet.InsnDef(106, "21c", 1, "sput-boolean"), new DexDalvikInstructionSet.InsnDef(107, "21c", 1, "sput-byte"), new DexDalvikInstructionSet.InsnDef(108, "21c", 1, "sput-char"), new DexDalvikInstructionSet.InsnDef(109, "21c", 1, "sput-short"), new DexDalvikInstructionSet.InsnDef(110, "35c", 65536, "invoke-virtual"), new DexDalvikInstructionSet.InsnDef(111, "35c", 65536, "invoke-super"), new DexDalvikInstructionSet.InsnDef(112, "35c", 65536, "invoke-direct"), new DexDalvikInstructionSet.InsnDef(113, "35c", 65536, "invoke-static"), new DexDalvikInstructionSet.InsnDef(114, "35c", 65536, "invoke-interface"), new DexDalvikInstructionSet.InsnDef(115, "10x"), new DexDalvikInstructionSet.InsnDef(116, "3rc", 65536, "invoke-virtual/range"), new DexDalvikInstructionSet.InsnDef(117, "3rc", 65536, "invoke-super/range"), new DexDalvikInstructionSet.InsnDef(118, "3rc", 65536, "invoke-direct/range"), new DexDalvikInstructionSet.InsnDef(119, "3rc", 65536, "invoke-static/range"), new DexDalvikInstructionSet.InsnDef(120, "3rc", 65536, "invoke-interface/range"), new DexDalvikInstructionSet.InsnDef(121, "10x"), new DexDalvikInstructionSet.InsnDef(122, "10x"), new DexDalvikInstructionSet.InsnDef(123, "12x", 18, "neg-int"), new DexDalvikInstructionSet.InsnDef(124, "12x", 18, "not-int"), new DexDalvikInstructionSet.InsnDef(125, "12x", 4608, "neg-long"), new DexDalvikInstructionSet.InsnDef(126, "12x", 4608, "not-long"), new DexDalvikInstructionSet.InsnDef(127, "12x", 18, "neg-float"), new DexDalvikInstructionSet.InsnDef(128, "12x", 4608, "neg-double"), new DexDalvikInstructionSet.InsnDef(129, "12x", 4098, "int-to-long"), new DexDalvikInstructionSet.InsnDef(130, "12x", 18, "int-to-float"), new DexDalvikInstructionSet.InsnDef(131, "12x", 4098, "int-to-double"), new DexDalvikInstructionSet.InsnDef(132, "12x", 528, "long-to-int"), new DexDalvikInstructionSet.InsnDef(133, "12x", 528, "long-to-float"), new DexDalvikInstructionSet.InsnDef(134, "12x", 4608, "long-to-double"), new DexDalvikInstructionSet.InsnDef(135, "12x", 18, "float-to-int"), new DexDalvikInstructionSet.InsnDef(136, "12x", 4098, "float-to-long"), new DexDalvikInstructionSet.InsnDef(137, "12x", 4098, "float-to-double"), new DexDalvikInstructionSet.InsnDef(138, "12x", 528, "double-to-int"), new DexDalvikInstructionSet.InsnDef(139, "12x", 4608, "double-to-long"), new DexDalvikInstructionSet.InsnDef(140, "12x", 528, "double-to-float"), new DexDalvikInstructionSet.InsnDef(141, "12x", 18, "int-to-byte"), new DexDalvikInstructionSet.InsnDef(142, "12x", 18, "int-to-char"), new DexDalvikInstructionSet.InsnDef(143, "12x", 18, "int-to-short"), new DexDalvikInstructionSet.InsnDef(144, "23x", 22, "add-int"), new DexDalvikInstructionSet.InsnDef(145, "23x", 22, "sub-int"), new DexDalvikInstructionSet.InsnDef(146, "23x", 22, "mul-int"), new DexDalvikInstructionSet.InsnDef(147, "23x", 22, "div-int"), new DexDalvikInstructionSet.InsnDef(148, "23x", 22, "rem-int"), new DexDalvikInstructionSet.InsnDef(149, "23x", 22, "and-int"), new DexDalvikInstructionSet.InsnDef(150, "23x", 22, "or-int"), new DexDalvikInstructionSet.InsnDef(151, "23x", 22, "xor-int"), new DexDalvikInstructionSet.InsnDef(152, "23x", 22, "shl-int"), new DexDalvikInstructionSet.InsnDef(153, "23x", 22, "shr-int"), new DexDalvikInstructionSet.InsnDef(154, "23x", 22, "ushr-int"), new DexDalvikInstructionSet.InsnDef(155, "23x", 5632, "add-long"), new DexDalvikInstructionSet.InsnDef(156, "23x", 5632, "sub-long"), new DexDalvikInstructionSet.InsnDef(157, "23x", 5632, "mul-long"), new DexDalvikInstructionSet.InsnDef(158, "23x", 5632, "div-long"), new DexDalvikInstructionSet.InsnDef(159, "23x", 5632, "rem-long"), new DexDalvikInstructionSet.InsnDef(160, "23x", 5632, "and-long"), new DexDalvikInstructionSet.InsnDef(161, "23x", 5632, "or-long"), new DexDalvikInstructionSet.InsnDef(162, "23x", 5632, "xor-long"), new DexDalvikInstructionSet.InsnDef(163, "23x", 5632, "shl-long"), new DexDalvikInstructionSet.InsnDef(164, "23x", 5632, "shr-long"), new DexDalvikInstructionSet.InsnDef(165, "23x", 5632, "ushr-long"), new DexDalvikInstructionSet.InsnDef(166, "23x", 22, "add-float"), new DexDalvikInstructionSet.InsnDef(167, "23x", 22, "sub-float"), new DexDalvikInstructionSet.InsnDef(168, "23x", 22, "mul-float"), new DexDalvikInstructionSet.InsnDef(169, "23x", 22, "div-float"), new DexDalvikInstructionSet.InsnDef(170, "23x", 22, "rem-float"), new DexDalvikInstructionSet.InsnDef(171, "23x", 5632, "add-double"), new DexDalvikInstructionSet.InsnDef(172, "23x", 5632, "sub-double"), new DexDalvikInstructionSet.InsnDef(173, "23x", 5632, "mul-double"), new DexDalvikInstructionSet.InsnDef(174, "23x", 5632, "div-double"), new DexDalvikInstructionSet.InsnDef(175, "23x", 5632, "rem-double"), new DexDalvikInstructionSet.InsnDef(176, "12x", 19, "add-int/2addr"), new DexDalvikInstructionSet.InsnDef(177, "12x", 19, "sub-int/2addr"), new DexDalvikInstructionSet.InsnDef(178, "12x", 19, "mul-int/2addr"), new DexDalvikInstructionSet.InsnDef(179, "12x", 19, "div-int/2addr"), new DexDalvikInstructionSet.InsnDef(180, "12x", 19, "rem-int/2addr"), new DexDalvikInstructionSet.InsnDef(181, "12x", 19, "and-int/2addr"), new DexDalvikInstructionSet.InsnDef(182, "12x", 19, "or-int/2addr"), new DexDalvikInstructionSet.InsnDef(183, "12x", 19, "xor-int/2addr"), new DexDalvikInstructionSet.InsnDef(184, "12x", 19, "shl-int/2addr"), new DexDalvikInstructionSet.InsnDef(185, "12x", 19, "shr-int/2addr"), new DexDalvikInstructionSet.InsnDef(186, "12x", 19, "ushr-int/2addr"), new DexDalvikInstructionSet.InsnDef(187, "12x", 4864, "add-long/2addr"), new DexDalvikInstructionSet.InsnDef(188, "12x", 4864, "sub-long/2addr"), new DexDalvikInstructionSet.InsnDef(189, "12x", 4864, "mul-long/2addr"), new DexDalvikInstructionSet.InsnDef(190, "12x", 4864, "div-long/2addr"), new DexDalvikInstructionSet.InsnDef(191, "12x", 4864, "rem-long/2addr"), new DexDalvikInstructionSet.InsnDef(192, "12x", 4864, "and-long/2addr"), new DexDalvikInstructionSet.InsnDef(193, "12x", 4864, "or-long/2addr"), new DexDalvikInstructionSet.InsnDef(194, "12x", 4864, "xor-long/2addr"), new DexDalvikInstructionSet.InsnDef(195, "12x", 4864, "shl-long/2addr"), new DexDalvikInstructionSet.InsnDef(196, "12x", 4864, "shr-long/2addr"), new DexDalvikInstructionSet.InsnDef(197, "12x", 4864, "ushr-long/2addr"), new DexDalvikInstructionSet.InsnDef(198, "12x", 19, "add-float/2addr"), new DexDalvikInstructionSet.InsnDef(199, "12x", 19, "sub-float/2addr"), new DexDalvikInstructionSet.InsnDef(200, "12x", 19, "mul-float/2addr"), new DexDalvikInstructionSet.InsnDef(201, "12x", 19, "div-float/2addr"), new DexDalvikInstructionSet.InsnDef(202, "12x", 19, "rem-float/2addr"), new DexDalvikInstructionSet.InsnDef(203, "12x", 4864, "add-double/2addr"), new DexDalvikInstructionSet.InsnDef(204, "12x", 4864, "sub-double/2addr"), new DexDalvikInstructionSet.InsnDef(205, "12x", 4864, "mul-double/2addr"), new DexDalvikInstructionSet.InsnDef(206, "12x", 4864, "div-double/2addr"), new DexDalvikInstructionSet.InsnDef(207, "12x", 4864, "rem-double/2addr"), new DexDalvikInstructionSet.InsnDef(208, "22s", 18, "add-int/lit16"), new DexDalvikInstructionSet.InsnDef(209, "22s", 18, "rsub-int"), new DexDalvikInstructionSet.InsnDef(210, "22s", 18, "mul-int/lit16"), new DexDalvikInstructionSet.InsnDef(211, "22s", 18, "div-int/lit16"), new DexDalvikInstructionSet.InsnDef(212, "22s", 18, "rem-int/lit16"), new DexDalvikInstructionSet.InsnDef(213, "22s", 18, "and-int/lit16"), new DexDalvikInstructionSet.InsnDef(214, "22s", 18, "or-int/lit16"), new DexDalvikInstructionSet.InsnDef(215, "22s", 18, "xor-int/lit16"), new DexDalvikInstructionSet.InsnDef(216, "22b", 18, "add-int/lit8"), new DexDalvikInstructionSet.InsnDef(217, "22b", 18, "rsub-int/lit8"), new DexDalvikInstructionSet.InsnDef(218, "22b", 18, "mul-int/lit8"), new DexDalvikInstructionSet.InsnDef(219, "22b", 18, "div-int/lit8"), new DexDalvikInstructionSet.InsnDef(220, "22b", 18, "rem-int/lit8"), new DexDalvikInstructionSet.InsnDef(221, "22b", 18, "and-int/lit8"), new DexDalvikInstructionSet.InsnDef(222, "22b", 18, "or-int/lit8"), new DexDalvikInstructionSet.InsnDef(223, "22b", 18, "xor-int/lit8"), new DexDalvikInstructionSet.InsnDef(224, "22b", 18, "shl-int/lit8"), new DexDalvikInstructionSet.InsnDef(225, "22b", 18, "shr-int/lit8"), new DexDalvikInstructionSet.InsnDef(226, "22b", 18, "ushr-int/lit8"), new DexDalvikInstructionSet.InsnDef(227, "10x"), new DexDalvikInstructionSet.InsnDef(228, "10x"), new DexDalvikInstructionSet.InsnDef(229, "10x"), new DexDalvikInstructionSet.InsnDef(230, "10x"), new DexDalvikInstructionSet.InsnDef(231, "10x"), new DexDalvikInstructionSet.InsnDef(232, "10x"), new DexDalvikInstructionSet.InsnDef(233, "10x"), new DexDalvikInstructionSet.InsnDef(234, "10x"), new DexDalvikInstructionSet.InsnDef(235, "10x"), new DexDalvikInstructionSet.InsnDef(236, "10x"), new DexDalvikInstructionSet.InsnDef(237, "10x"), new DexDalvikInstructionSet.InsnDef(238, "10x"), new DexDalvikInstructionSet.InsnDef(239, "10x"), new DexDalvikInstructionSet.InsnDef(240, "10x"), new DexDalvikInstructionSet.InsnDef(241, "10x"), new DexDalvikInstructionSet.InsnDef(242, "10x"), new DexDalvikInstructionSet.InsnDef(243, "10x"), new DexDalvikInstructionSet.InsnDef(244, "10x"), new DexDalvikInstructionSet.InsnDef(245, "10x"), new DexDalvikInstructionSet.InsnDef(246, "10x"), new DexDalvikInstructionSet.InsnDef(247, "10x"), new DexDalvikInstructionSet.InsnDef(248, "10x"), new DexDalvikInstructionSet.InsnDef(249, "10x"), new DexDalvikInstructionSet.InsnDef(250, "10x"), new DexDalvikInstructionSet.InsnDef(251, "10x"), new DexDalvikInstructionSet.InsnDef(252, "10x"), new DexDalvikInstructionSet.InsnDef(253, "10x"), new DexDalvikInstructionSet.InsnDef(254, "10x"), new DexDalvikInstructionSet.InsnDef(255, "10x")};
   static final DexDalvikInstructionSet.InsnDef[] extended_set = new DexDalvikInstructionSet.InsnDef[]{new DexDalvikInstructionSet.InsnDef(255, "41c", 16, "const-class/jumbo"), new DexDalvikInstructionSet.InsnDef(511, "41c", 1, "check-cast/jumbo"), new DexDalvikInstructionSet.InsnDef(767, "52c", 18, "instance-of/jumbo"), new DexDalvikInstructionSet.InsnDef(1023, "41c", 16, "new-instance/jumbo"), new DexDalvikInstructionSet.InsnDef(1279, "52c", 18, "new-array/jumbo"), new DexDalvikInstructionSet.InsnDef(1535, "5rc", 65536, "filled-new-array/jumbo"), new DexDalvikInstructionSet.InsnDef(1791, "52c", 18, "iget/jumbo"), new DexDalvikInstructionSet.InsnDef(2047, "52c", 4098, "iget-wide/jumbo"), new DexDalvikInstructionSet.InsnDef(2303, "52c", 18, "iget-object/jumbo"), new DexDalvikInstructionSet.InsnDef(2559, "52c", 18, "iget-boolean/jumbo"), new DexDalvikInstructionSet.InsnDef(2815, "52c", 18, "iget-byte/jumbo"), new DexDalvikInstructionSet.InsnDef(3071, "52c", 18, "iget-char/jumbo"), new DexDalvikInstructionSet.InsnDef(3327, "52c", 18, "iget-short/jumbo"), new DexDalvikInstructionSet.InsnDef(3583, "52c", 3, "iput/jumbo"), new DexDalvikInstructionSet.InsnDef(3839, "52c", 258, "iput-wide/jumbo"), new DexDalvikInstructionSet.InsnDef(4095, "52c", 3, "iput-object/jumbo"), new DexDalvikInstructionSet.InsnDef(4351, "52c", 3, "iput-boolean/jumbo"), new DexDalvikInstructionSet.InsnDef(4607, "52c", 3, "iput-byte/jumbo"), new DexDalvikInstructionSet.InsnDef(4863, "52c", 3, "iput-char/jumbo"), new DexDalvikInstructionSet.InsnDef(5119, "52c", 3, "iput-short/jumbo"), new DexDalvikInstructionSet.InsnDef(5375, "41c", 16, "sget/jumbo"), new DexDalvikInstructionSet.InsnDef(5631, "41c", 4096, "sget-wide/jumbo"), new DexDalvikInstructionSet.InsnDef(5887, "41c", 16, "sget-object/jumbo"), new DexDalvikInstructionSet.InsnDef(6143, "41c", 16, "sget-boolean/jumbo"), new DexDalvikInstructionSet.InsnDef(6399, "41c", 16, "sget-byte/jumbo"), new DexDalvikInstructionSet.InsnDef(6655, "41c", 16, "sget-char/jumbo"), new DexDalvikInstructionSet.InsnDef(6911, "41c", 16, "sget-short/jumbo"), new DexDalvikInstructionSet.InsnDef(7167, "41c", 1, "sput/jumbo"), new DexDalvikInstructionSet.InsnDef(7423, "41c", 256, "sput-wide/jumbo"), new DexDalvikInstructionSet.InsnDef(7679, "41c", 1, "sput-object/jumbo"), new DexDalvikInstructionSet.InsnDef(7935, "41c", 1, "sput-boolean/jumbo"), new DexDalvikInstructionSet.InsnDef(8191, "41c", 1, "sput-byte/jumbo"), new DexDalvikInstructionSet.InsnDef(8447, "41c", 1, "sput-char/jumbo"), new DexDalvikInstructionSet.InsnDef(8703, "41c", 1, "sput-short/jumbo"), new DexDalvikInstructionSet.InsnDef(8959, "5rc", 65536, "invoke-virtual/jumbo"), new DexDalvikInstructionSet.InsnDef(9215, "5rc", 65536, "invoke-super/jumbo"), new DexDalvikInstructionSet.InsnDef(9471, "5rc", 65536, "invoke-direct/jumbo"), new DexDalvikInstructionSet.InsnDef(9727, "5rc", 65536, "invoke-static/jumbo"), new DexDalvikInstructionSet.InsnDef(9983, "5rc", 65536, "invoke-interface/jumbo")};

   // $FF: synthetic class
   static class SyntheticClass_1 {
   }

   static class InsnDef {
      int opcode;
      String format;
      String mnemonic;

      private InsnDef(int var1, String var2, int var3, String var4) {
         this.opcode = var1;
         this.format = var2;
         this.mnemonic = var4;
      }

      private InsnDef(int var1, String var2, String var3) {
         this.opcode = var1;
         this.format = var2;
         this.mnemonic = var3;
      }

      private InsnDef(int var1, String var2) {
         this.opcode = var1;
         this.format = var2;
         this.mnemonic = "";
      }

      private InsnDef(int var1) {
         this.opcode = var1;
         this.format = "10x";
         this.mnemonic = "";
      }

      // $FF: synthetic method
      InsnDef(int var1, String var2, int var3, String var4, DexDalvikInstructionSet.SyntheticClass_1 var5) {
         this(var1, var2, var3, var4);
      }

      // $FF: synthetic method
      InsnDef(int var1, String var2, DexDalvikInstructionSet.SyntheticClass_1 var3) {
         this(var1, var2);
      }
   }
}
