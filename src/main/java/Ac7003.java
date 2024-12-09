/** Verang generated Mon Jul 17 09:06:02 EDT 2017
 ** Name = AC7003
 */
package us.verang.mmc;

import us.verang.framework.*;
import us.verang.framework.cobol.*;


@SuppressWarnings("unused")
public class Ac7003 extends CobolCode {

  public static final A PROGRAM=new A("*PROGRAM",32,"AC7003");

  private final CobolVariableFactory factory_=getCobolFactory();

/*  000230 FD  TRUCKI-FIL
    000240     BLOCK CONTAINS 0 RECORDS
    000250     LABEL RECORD IS STANDARD.   */

/*  000260*01  TRUCKI                       COPY MACL598.
    000270                                  COPY MACL785
    000280                                  REPLACING MACL785 BY TRUCKI.
    COPYCODE:macl785
    000040 01  TRUCKI.   */

    private Group trucki=factory_.makeGroup("TRUCKI");  /* offset in record:0 (0x0) */

/*  000010******************************************************************
    000020*        Ä×Â¸ËÞÝ Ï½À-(2000ÈÝ À²µ³)    LRECL=100  BLKSIZE=27900   *
    000030******************************************************************
    000050     02  DATAID                   PIC  X(03).   */
    private X dataid=trucki.makeX("DATAID",3);  /* offset in record:0 (0x0) */

/*  000060*                                           >>>  ÃÞ-ÀID 'C26'  ***
    000070     02  FILLER                   PIC  X(01).   */
    private X filler_1Filler=trucki.makeX("FILLER",1);  /* offset in record:3 (0x3) */

/*  000080*                                           >>>  NO/USE        ***
    000090     02  VSAMKY.   */
    private Group vsamky=trucki.makeGroup("VSAMKY");  /* offset in record:4 (0x4) */

/*  000100*                                           >>>  VS-KEY        ***
    000110         03  MASTKB               PIC  X.   */
    private X mastkb=vsamky.makeX("MASTKB",1);  /* offset in record:4 (0x4) */

/*  000120*                                           >>>  Ï½À- ¸ÌÞÝ     ***
    000130         03  KOJKBN               PIC  X.   */
    private X kojkbn=vsamky.makeX("KOJKBN",1);  /* offset in record:5 (0x5) */

/*  000140*                                           >>>  º³¼ÞÖ³ ¸ÌÞÝ   ***
    000150         03  BIN-NO               PIC  9(02).   */
    private UnsignedZoned binNo=vsamky.makeUnsignedZoned("BIN-NO",2,0);  /* offset in record:6 (0x6) */

/*  000160*                                           >>>  ËÞÝ NO        ***
    000170         03  SYABAN               PIC  9.   */
    private UnsignedZoned syaban=vsamky.makeUnsignedZoned("SYABAN",1,0);  /* offset in record:8 (0x8) */

/*  000180*                                           >>>  ¼ÔÊÞÝ         ***
    000190         03  FILLER               PIC  X(07).   */
    private X filler_2Filler=vsamky.makeX("FILLER",7);  /* offset in record:9 (0x9) */

/*  000200*                                           >>>  NO/USE        ***
    000210     02  DN-KBN                   PIC  X(01).   */
    private X dnKbn=trucki.makeX("DN-KBN",1);  /* offset in record:16 (0x10) */

/*  000220*                                           >>>  D/N¸ÌÞÝ       ***
    000230     02  KONKAI.   */
    private Group konkai=trucki.makeGroup("KONKAI");  /* offset in record:17 (0x11) */

/*  000240*                                           >>>  ºÝ¶²¼ÞÖ³Î³    ***
    000250         03  K-KAIS.   */
    private Group kKais=konkai.makeGroup("K-KAIS");  /* offset in record:17 (0x11) */

/*  000260*                                           >>>  ºÝ¶² ¶²¼      ***
    000270             04  STAYYY           PIC  9(04).   */
    private UnsignedZoned stayyy=kKais.makeUnsignedZoned("STAYYY",4,0);  /* offset in record:17 (0x11) */

/*  000280*                                           >>>  ÈÝ            ***
    000290             04  STAMMM           PIC  9(02).   */
    private UnsignedZoned stammm=kKais.makeUnsignedZoned("STAMMM",2,0);  /* offset in record:21 (0x15) */

/*  000300*                                           >>>  Â·            ***
    000310         03  K-SHUR.   */
    private Group kShur=konkai.makeGroup("K-SHUR");  /* offset in record:23 (0x17) */

/*  000320*                                           >>>  ºÝ¶² ¼Õ³ØÖ³   ***
    000330             04  ENDYYY           PIC  9(04).   */
    private UnsignedZoned endyyy=kShur.makeUnsignedZoned("ENDYYY",4,0);  /* offset in record:23 (0x17) */

/*  000340*                                           >>>  ÈÝ            ***
    000350             04  ENDMMM           PIC  9(02).   */
    private UnsignedZoned endmmm=kShur.makeUnsignedZoned("ENDMMM",2,0);  /* offset in record:27 (0x1b) */

/*  000360*                                           >>>  Â·            ***
    000370         03  HATJKN               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal hatjkn=konkai.makePackedDecimal("HATJKN",2,1);  /* offset in record:29 (0x1d) */

/*  000380*                                           >>>  ÊÂ ¼Þº¸       ***
    000390         03  CHKJKN               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal chkjkn=konkai.makePackedDecimal("CHKJKN",2,1);  /* offset in record:31 (0x1f) */

/*  000400*                                           >>>  ÁÔ¸ ¼Þº¸      ***
    000410         03  MAXWGT               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal maxwgt=konkai.makePackedDecimal("MAXWGT",2,1);  /* offset in record:33 (0x21) */

/*  000420*                                           >>>  MAX¼ÞÕ³ØÖ³    ***
    000430         03  HASSOU.   */
    private Group hassou=konkai.makeGroup("HASSOU");  /* offset in record:35 (0x23) */

/*  000440*                                           >>>  ÊÂ¿³ÊÞ ½³     ***
    000450             04  HASKBN OCCURS 3  PIC  X(02).   */
    private Array<X> haskbn=hassou.makeX("HASKBN",2,range(1,3));  /* offset in record:35 (0x23) */

/*  000460*                                           >>>  ÊÂ¿³ ¸ÌÞÝ     ***
    000470         03  OROSUU.   */
    private Group orosuu=konkai.makeGroup("OROSUU");  /* offset in record:41 (0x29) */

/*  000480*                                           >>>  µÛ¼ÊÞ½³       ***
    000490             04  IKIKBN OCCURS 3  PIC  X(02).   */
    private Array<X> ikikbn=orosuu.makeX("IKIKBN",2,range(1,3));  /* offset in record:41 (0x29) */

/*  000500*                                           >>>  ²·»· ¸ÌÞÝ     ***
    000510     02  JIKAII.   */
    private Group jikaii=trucki.makeGroup("JIKAII");  /* offset in record:47 (0x2f) */

/*  000520*                                           >>>  ¼Þ¶² ¼ÞÖ³Î³   ***
    000530         03  J-KAIS.   */
    private Group jKais=jikaii.makeGroup("J-KAIS");  /* offset in record:47 (0x2f) */

/*  000540*                                           >>>  ¼Þ¶² ¶²¼      ***
    000550             04  JSTAYY           PIC  9(04).   */
    private UnsignedZoned jstayy=jKais.makeUnsignedZoned("JSTAYY",4,0);  /* offset in record:47 (0x2f) */

/*  000560*                                           >>>  ÈÝ            ***
    000570             04  JSTAMM           PIC  9(02).   */
    private UnsignedZoned jstamm=jKais.makeUnsignedZoned("JSTAMM",2,0);  /* offset in record:51 (0x33) */

/*  000580*                                           >>>  Â·            ***
    000590         03  J-SHUR.   */
    private Group jShur=jikaii.makeGroup("J-SHUR");  /* offset in record:53 (0x35) */

/*  000600*                                           >>>  ¼Þ¶² ¼Õ³ØÖ³   ***
    000610             04  JENDYY           PIC  9(04).   */
    private UnsignedZoned jendyy=jShur.makeUnsignedZoned("JENDYY",4,0);  /* offset in record:53 (0x35) */

/*  000620*                                           >>>  ÈÝ            ***
    000630             04  JENDMM           PIC  9(02).   */
    private UnsignedZoned jendmm=jShur.makeUnsignedZoned("JENDMM",2,0);  /* offset in record:57 (0x39) */

/*  000640*                                           >>>  Â·            ***
    000650         03  J-HATJ               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal jHatj=jikaii.makePackedDecimal("J-HATJ",2,1);  /* offset in record:59 (0x3b) */

/*  000660*                                           >>>  ÊÂ ¼Þº¸       ***
    000670         03  J-CHKJ               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal jChkj=jikaii.makePackedDecimal("J-CHKJ",2,1);  /* offset in record:61 (0x3d) */

/*  000680*                                           >>>  ÁÔ¸ ¼Þº¸      ***
    000690         03  J-MAXW               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal jMaxw=jikaii.makePackedDecimal("J-MAXW",2,1);  /* offset in record:63 (0x3f) */

/*  000700*                                           >>>  MAX¼ÞÕ³ØÖ³    ***
    000710         03  J-HASO.   */
    private Group jHaso=jikaii.makeGroup("J-HASO");  /* offset in record:65 (0x41) */

/*  000720*                                           >>>  ÊÂ¿³ ÊÞ½³     ***
    000730             04  J-HASK OCCURS 3  PIC  X(02).   */
    private Array<X> jHask=jHaso.makeX("J-HASK",2,range(1,3));  /* offset in record:65 (0x41) */

/*  000740*                                           >>>  ÊÂ¿³ ¸ÌÞÝ     ***
    000750         03  J-OROS.   */
    private Group jOros=jikaii.makeGroup("J-OROS");  /* offset in record:71 (0x47) */

/*  000760*                                           >>>  µÛ¼ÊÞ¼Ö       ***
    000770             04  J-IKIK OCCURS 3  PIC  X(02).   */
    private Array<X> jIkik=jOros.makeX("J-IKIK",2,range(1,3));  /* offset in record:71 (0x47) */

/*  000780*                                           >>>  ²·»·¸ÌÞÝ      ***
    000790     02  KN-KAI.   */
    private Group knKai=trucki.makeGroup("KN-KAI");  /* offset in record:77 (0x4d) */

/*  000790*                                           >>>  ºÝ¶²¼ÞÖ³Î³    ***
    000790         03  KMAXVL               PIC S9(03)V9(02) COMP-3.   */
    private PackedDecimal kmaxvl=knKai.makePackedDecimal("KMAXVL",3,2);  /* offset in record:77 (0x4d) */

/*  000790*                                           >>>  Ä×Â¸ MAX Ö³¾· ***
    000790     02  JI-KAI.   */
    private Group jiKai=trucki.makeGroup("JI-KAI");  /* offset in record:80 (0x50) */

/*  000790*                                           >>>  ¼Þ¶² ¼ÞÖ³Î³   ***
    000790         03  JMAXVL               PIC S9(03)V9(02) COMP-3.   */
    private PackedDecimal jmaxvl=jiKai.makePackedDecimal("JMAXVL",3,2);  /* offset in record:80 (0x50) */

/*  000790*                                           >>>  Ä×Â¸ MAX Ö³¾· ***
    000790     02  FILLER                   PIC  X(01).   */
    private X filler_3Filler=trucki.makeX("FILLER",1);  /* offset in record:83 (0x53) */

/*  000800*                                           >>>  NO/USE        ***
    000810     02  PASWOD                   PIC  X(05).   */
    private X paswod=trucki.makeX("PASWOD",5);  /* offset in record:84 (0x54) */

/*  000820*                                           >>>  Êß½Ü-ÄÞ       ***
    000830     02  TERMID                   PIC  X(04).   */
    private X termid=trucki.makeX("TERMID",4);  /* offset in record:89 (0x59) */

/*  000840*                                           >>>  ÀÝÏÂ ID       ***
    000850     02  KOUSIN                   PIC  S9(13) COMP-3.   */
    private PackedDecimal kousin=trucki.makePackedDecimal("KOUSIN",13,0);  /* offset in record:93 (0x5d) */

/*  000300 FD  KAKUTI-FIL
    000310     BLOCK CONTAINS 0 RECORDS
    000320     LABEL RECORD IS STANDARD.   */

/*  000330*01  KAKUTI                       COPY MACL597.
    000340                                  COPY MACL597
    000350                                  REPLACING MACL597 BY KAKUTI.
    COPYCODE:macl597
    000000 01  KAKUTI.   */

    private Group kakuti=factory_.makeGroup("KAKUTI");  /* offset in record:0 (0x0) */

/*  000000******************************************************************
    000000*        ¶¸Ã² ·¶Ý Ï½À-                LRECL=80   BLKSIZE=27920   *
    000000******************************************************************
    000000     02  DATAID                   PIC  X(03).   */
    private X kakutiDataid=kakuti.makeX("DATAID",3);  /* offset in record:0 (0x0) */

/*  000000*                                           >>>  ÃÞ-ÀID 'C25'  ***
    000000     02  FILLER                   PIC  X(02).   */
    private X filler_4Filler=kakuti.makeX("FILLER",2);  /* offset in record:3 (0x3) */

/*  000000*                                           >>>  NO/USE        ***
    000000     02  KAKU-S.   */
    private Group kakuS=kakuti.makeGroup("KAKU-S");  /* offset in record:5 (0x5) */

/*  000000*                                           >>>  ¶¸Ã² ¶²¼ ËÞ   ***
    000000         03  KAKUSY               PIC  9(04).   */
    private UnsignedZoned kakusy=kakuS.makeUnsignedZoned("KAKUSY",4,0);  /* offset in record:5 (0x5) */

/*  000000*                                           >>>  ÈÝ            ***
    000000         03  KAKUSM               PIC  9(02).   */
    private UnsignedZoned kakusm=kakuS.makeUnsignedZoned("KAKUSM",2,0);  /* offset in record:9 (0x9) */

/*  000000*                                           >>>  Â·            ***
    000000         03  KAKUSD               PIC  9(02).   */
    private UnsignedZoned kakusd=kakuS.makeUnsignedZoned("KAKUSD",2,0);  /* offset in record:11 (0xb) */

/*  000000*                                           >>>  Ë             ***
    000000         03  KAKUSJ               PIC  9(02)V9(01).   */
    private UnsignedZoned kakusj=kakuS.makeUnsignedZoned("KAKUSJ",2,1);  /* offset in record:13 (0xd) */

/*  000000*                                           >>>  ¼Þ            ***
    000000     02  JIKA-S.   */
    private Group jikaS=kakuti.makeGroup("JIKA-S");  /* offset in record:16 (0x10) */

/*  000000*                                           >>>  ¼Þ¶²¶¸Ã²¶²¼ËÞ ***
    000000         03  JIKASY               PIC  9(04).   */
    private UnsignedZoned jikasy=jikaS.makeUnsignedZoned("JIKASY",4,0);  /* offset in record:16 (0x10) */

/*  000000*                                           >>>  ÈÝ            ***
    000000         03  JIKASM               PIC  9(02).   */
    private UnsignedZoned jikasm=jikaS.makeUnsignedZoned("JIKASM",2,0);  /* offset in record:20 (0x14) */

/*  000000*                                           >>>  Â·            ***
    000000         03  JIKASD               PIC  9(02).   */
    private UnsignedZoned jikasd=jikaS.makeUnsignedZoned("JIKASD",2,0);  /* offset in record:22 (0x16) */

/*  000000*                                           >>>  Ë             ***
    000000         03  JIKASJ               PIC  9(02)V9(01).   */
    private UnsignedZoned jikasj=jikaS.makeUnsignedZoned("JIKASJ",2,1);  /* offset in record:24 (0x18) */

/*  000000*                                           >>>  ¼Þ            ***
    000000     02  NAIJIE.   */
    private Group naijie=kakuti.makeGroup("NAIJIE");  /* offset in record:27 (0x1b) */

/*  000000*                                           >>>  Å²¼Þ¼Õ³ØÖ³ËÞ  ***
    000000         03  NAIJIY               PIC  9(04).   */
    private UnsignedZoned naijiy=naijie.makeUnsignedZoned("NAIJIY",4,0);  /* offset in record:27 (0x1b) */

/*  000000*                                           >>>  ÈÝ            ***
    000000         03  NAIJIM               PIC  9(02).   */
    private UnsignedZoned naijim=naijie.makeUnsignedZoned("NAIJIM",2,0);  /* offset in record:31 (0x1f) */

/*  000000*                                           >>>  Â·            ***
    000000         03  NAIJID               PIC  9(02).   */
    private UnsignedZoned naijid=naijie.makeUnsignedZoned("NAIJID",2,0);  /* offset in record:33 (0x21) */

/*  000000*                                           >>>  Ë             ***
    000000         03  NAIJIJ               PIC  9(02)V9(01).   */
    private UnsignedZoned naijij=naijie.makeUnsignedZoned("NAIJIJ",2,1);  /* offset in record:35 (0x23) */

/*  000000*                                           >>>  ¼Þ            ***
    000000     02  LOTGKN.   */
    private Group lotgkn=kakuti.makeGroup("LOTGKN");  /* offset in record:38 (0x26) */

/*  000000*                                           >>>  ÛÂÄ¸Ø±¹Þ¹ÞÝ¶²Ë***
    000000         03  LOTGKY               PIC  9(04).   */
    private UnsignedZoned lotgky=lotgkn.makeUnsignedZoned("LOTGKY",4,0);  /* offset in record:38 (0x26) */

/*  000000*                                           >>>  ÈÝ            ***
    000000         03  LOTGKM               PIC  9(02).   */
    private UnsignedZoned lotgkm=lotgkn.makeUnsignedZoned("LOTGKM",2,0);  /* offset in record:42 (0x2a) */

/*  000000*                                           >>>  Â·            ***
    000000         03  LOTGKD               PIC  9(02).   */
    private UnsignedZoned lotgkd=lotgkn.makeUnsignedZoned("LOTGKD",2,0);  /* offset in record:44 (0x2c) */

/*  000000*                                           >>>  Ë             ***
    000000         03  LOTGKJ               PIC  9(02)V9(01).   */
    private UnsignedZoned lotgkj=lotgkn.makeUnsignedZoned("LOTGKJ",2,1);  /* offset in record:46 (0x2e) */

/*  000000*                                           >>>  ¼Þ            ***
    000000     02  FILLER                   PIC  X(31).   */
    private X filler_5Filler=kakuti.makeX("FILLER",31);  /* offset in record:49 (0x31) */

/*  000370 FD  TRUCKO-FIL
    000380     BLOCK CONTAINS 0 RECORDS
    000390     LABEL RECORD IS STANDARD.   */

/*  000400*01  TRUCKO                       COPY MACL598 SUPPRESS.
    000410                                  COPY MACL785 SUPPRESS
    000420                                  REPLACING MACL785 BY TRUCKO.
    COPYCODE:macl785
    000040 01  TRUCKO.   */

    private Group trucko=factory_.makeGroup("TRUCKO");  /* offset in record:0 (0x0) */

/*  000010******************************************************************
    000020*        Ä×Â¸ËÞÝ Ï½À-(2000ÈÝ À²µ³)    LRECL=100  BLKSIZE=27900   *
    000030******************************************************************
    000050     02  DATAID                   PIC  X(03).   */
    private X truckoDataid=trucko.makeX("DATAID",3);  /* offset in record:0 (0x0) */

/*  000060*                                           >>>  ÃÞ-ÀID 'C26'  ***
    000070     02  FILLER                   PIC  X(01).   */
    private X filler_6Filler=trucko.makeX("FILLER",1);  /* offset in record:3 (0x3) */

/*  000080*                                           >>>  NO/USE        ***
    000090     02  VSAMKY.   */
    private Group truckoVsamky=trucko.makeGroup("VSAMKY");  /* offset in record:4 (0x4) */

/*  000100*                                           >>>  VS-KEY        ***
    000110         03  MASTKB               PIC  X.   */
    private X vsamkyMastkb=truckoVsamky.makeX("MASTKB",1);  /* offset in record:4 (0x4) */

/*  000120*                                           >>>  Ï½À- ¸ÌÞÝ     ***
    000130         03  KOJKBN               PIC  X.   */
    private X vsamkyKojkbn=truckoVsamky.makeX("KOJKBN",1);  /* offset in record:5 (0x5) */

/*  000140*                                           >>>  º³¼ÞÖ³ ¸ÌÞÝ   ***
    000150         03  BIN-NO               PIC  9(02).   */
    private UnsignedZoned vsamkyBinNo=truckoVsamky.makeUnsignedZoned("BIN-NO",2,0);  /* offset in record:6 (0x6) */

/*  000160*                                           >>>  ËÞÝ NO        ***
    000170         03  SYABAN               PIC  9.   */
    private UnsignedZoned vsamkySyaban=truckoVsamky.makeUnsignedZoned("SYABAN",1,0);  /* offset in record:8 (0x8) */

/*  000180*                                           >>>  ¼ÔÊÞÝ         ***
    000190         03  FILLER               PIC  X(07).   */
    private X filler_7Filler=truckoVsamky.makeX("FILLER",7);  /* offset in record:9 (0x9) */

/*  000200*                                           >>>  NO/USE        ***
    000210     02  DN-KBN                   PIC  X(01).   */
    private X truckoDnKbn=trucko.makeX("DN-KBN",1);  /* offset in record:16 (0x10) */

/*  000220*                                           >>>  D/N¸ÌÞÝ       ***
    000230     02  KONKAI.   */
    private Group truckoKonkai=trucko.makeGroup("KONKAI");  /* offset in record:17 (0x11) */

/*  000240*                                           >>>  ºÝ¶²¼ÞÖ³Î³    ***
    000250         03  K-KAIS.   */
    private Group konkaiKKais=truckoKonkai.makeGroup("K-KAIS");  /* offset in record:17 (0x11) */

/*  000260*                                           >>>  ºÝ¶² ¶²¼      ***
    000270             04  STAYYY           PIC  9(04).   */
    private UnsignedZoned kKaisStayyy=konkaiKKais.makeUnsignedZoned("STAYYY",4,0);  /* offset in record:17 (0x11) */

/*  000280*                                           >>>  ÈÝ            ***
    000290             04  STAMMM           PIC  9(02).   */
    private UnsignedZoned kKaisStammm=konkaiKKais.makeUnsignedZoned("STAMMM",2,0);  /* offset in record:21 (0x15) */

/*  000300*                                           >>>  Â·            ***
    000310         03  K-SHUR.   */
    private Group konkaiKShur=truckoKonkai.makeGroup("K-SHUR");  /* offset in record:23 (0x17) */

/*  000320*                                           >>>  ºÝ¶² ¼Õ³ØÖ³   ***
    000330             04  ENDYYY           PIC  9(04).   */
    private UnsignedZoned kShurEndyyy=konkaiKShur.makeUnsignedZoned("ENDYYY",4,0);  /* offset in record:23 (0x17) */

/*  000340*                                           >>>  ÈÝ            ***
    000350             04  ENDMMM           PIC  9(02).   */
    private UnsignedZoned kShurEndmmm=konkaiKShur.makeUnsignedZoned("ENDMMM",2,0);  /* offset in record:27 (0x1b) */

/*  000360*                                           >>>  Â·            ***
    000370         03  HATJKN               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal konkaiHatjkn=truckoKonkai.makePackedDecimal("HATJKN",2,1);  /* offset in record:29 (0x1d) */

/*  000380*                                           >>>  ÊÂ ¼Þº¸       ***
    000390         03  CHKJKN               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal konkaiChkjkn=truckoKonkai.makePackedDecimal("CHKJKN",2,1);  /* offset in record:31 (0x1f) */

/*  000400*                                           >>>  ÁÔ¸ ¼Þº¸      ***
    000410         03  MAXWGT               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal konkaiMaxwgt=truckoKonkai.makePackedDecimal("MAXWGT",2,1);  /* offset in record:33 (0x21) */

/*  000420*                                           >>>  MAX¼ÞÕ³ØÖ³    ***
    000430         03  HASSOU.   */
    private Group konkaiHassou=truckoKonkai.makeGroup("HASSOU");  /* offset in record:35 (0x23) */

/*  000440*                                           >>>  ÊÂ¿³ÊÞ ½³     ***
    000450             04  HASKBN OCCURS 3  PIC  X(02).   */
    private Array<X> hassouHaskbn=konkaiHassou.makeX("HASKBN",2,range(1,3));  /* offset in record:35 (0x23) */

/*  000460*                                           >>>  ÊÂ¿³ ¸ÌÞÝ     ***
    000470         03  OROSUU.   */
    private Group konkaiOrosuu=truckoKonkai.makeGroup("OROSUU");  /* offset in record:41 (0x29) */

/*  000480*                                           >>>  µÛ¼ÊÞ½³       ***
    000490             04  IKIKBN OCCURS 3  PIC  X(02).   */
    private Array<X> orosuuIkikbn=konkaiOrosuu.makeX("IKIKBN",2,range(1,3));  /* offset in record:41 (0x29) */

/*  000500*                                           >>>  ²·»· ¸ÌÞÝ     ***
    000510     02  JIKAII.   */
    private Group truckoJikaii=trucko.makeGroup("JIKAII");  /* offset in record:47 (0x2f) */

/*  000520*                                           >>>  ¼Þ¶² ¼ÞÖ³Î³   ***
    000530         03  J-KAIS.   */
    private Group jikaiiJKais=truckoJikaii.makeGroup("J-KAIS");  /* offset in record:47 (0x2f) */

/*  000540*                                           >>>  ¼Þ¶² ¶²¼      ***
    000550             04  JSTAYY           PIC  9(04).   */
    private UnsignedZoned jKaisJstayy=jikaiiJKais.makeUnsignedZoned("JSTAYY",4,0);  /* offset in record:47 (0x2f) */

/*  000560*                                           >>>  ÈÝ            ***
    000570             04  JSTAMM           PIC  9(02).   */
    private UnsignedZoned jKaisJstamm=jikaiiJKais.makeUnsignedZoned("JSTAMM",2,0);  /* offset in record:51 (0x33) */

/*  000580*                                           >>>  Â·            ***
    000590         03  J-SHUR.   */
    private Group jikaiiJShur=truckoJikaii.makeGroup("J-SHUR");  /* offset in record:53 (0x35) */

/*  000600*                                           >>>  ¼Þ¶² ¼Õ³ØÖ³   ***
    000610             04  JENDYY           PIC  9(04).   */
    private UnsignedZoned jShurJendyy=jikaiiJShur.makeUnsignedZoned("JENDYY",4,0);  /* offset in record:53 (0x35) */

/*  000620*                                           >>>  ÈÝ            ***
    000630             04  JENDMM           PIC  9(02).   */
    private UnsignedZoned jShurJendmm=jikaiiJShur.makeUnsignedZoned("JENDMM",2,0);  /* offset in record:57 (0x39) */

/*  000640*                                           >>>  Â·            ***
    000650         03  J-HATJ               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal jikaiiJHatj=truckoJikaii.makePackedDecimal("J-HATJ",2,1);  /* offset in record:59 (0x3b) */

/*  000660*                                           >>>  ÊÂ ¼Þº¸       ***
    000670         03  J-CHKJ               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal jikaiiJChkj=truckoJikaii.makePackedDecimal("J-CHKJ",2,1);  /* offset in record:61 (0x3d) */

/*  000680*                                           >>>  ÁÔ¸ ¼Þº¸      ***
    000690         03  J-MAXW               PIC  S9(02)V9 COMP-3.   */
    private PackedDecimal jikaiiJMaxw=truckoJikaii.makePackedDecimal("J-MAXW",2,1);  /* offset in record:63 (0x3f) */

/*  000700*                                           >>>  MAX¼ÞÕ³ØÖ³    ***
    000710         03  J-HASO.   */
    private Group jikaiiJHaso=truckoJikaii.makeGroup("J-HASO");  /* offset in record:65 (0x41) */

/*  000720*                                           >>>  ÊÂ¿³ ÊÞ½³     ***
    000730             04  J-HASK OCCURS 3  PIC  X(02).   */
    private Array<X> jHasoJHask=jikaiiJHaso.makeX("J-HASK",2,range(1,3));  /* offset in record:65 (0x41) */

/*  000740*                                           >>>  ÊÂ¿³ ¸ÌÞÝ     ***
    000750         03  J-OROS.   */
    private Group jikaiiJOros=truckoJikaii.makeGroup("J-OROS");  /* offset in record:71 (0x47) */

/*  000760*                                           >>>  µÛ¼ÊÞ¼Ö       ***
    000770             04  J-IKIK OCCURS 3  PIC  X(02).   */
    private Array<X> jOrosJIkik=jikaiiJOros.makeX("J-IKIK",2,range(1,3));  /* offset in record:71 (0x47) */

/*  000780*                                           >>>  ²·»·¸ÌÞÝ      ***
    000790     02  KN-KAI.   */
    private Group truckoKnKai=trucko.makeGroup("KN-KAI");  /* offset in record:77 (0x4d) */

/*  000790*                                           >>>  ºÝ¶²¼ÞÖ³Î³    ***
    000790         03  KMAXVL               PIC S9(03)V9(02) COMP-3.   */
    private PackedDecimal knKaiKmaxvl=truckoKnKai.makePackedDecimal("KMAXVL",3,2);  /* offset in record:77 (0x4d) */

/*  000790*                                           >>>  Ä×Â¸ MAX Ö³¾· ***
    000790     02  JI-KAI.   */
    private Group truckoJiKai=trucko.makeGroup("JI-KAI");  /* offset in record:80 (0x50) */

/*  000790*                                           >>>  ¼Þ¶² ¼ÞÖ³Î³   ***
    000790         03  JMAXVL               PIC S9(03)V9(02) COMP-3.   */
    private PackedDecimal jiKaiJmaxvl=truckoJiKai.makePackedDecimal("JMAXVL",3,2);  /* offset in record:80 (0x50) */

/*  000790*                                           >>>  Ä×Â¸ MAX Ö³¾· ***
    000790     02  FILLER                   PIC  X(01).   */
    private X filler_8Filler=trucko.makeX("FILLER",1);  /* offset in record:83 (0x53) */

/*  000800*                                           >>>  NO/USE        ***
    000810     02  PASWOD                   PIC  X(05).   */
    private X truckoPaswod=trucko.makeX("PASWOD",5);  /* offset in record:84 (0x54) */

/*  000820*                                           >>>  Êß½Ü-ÄÞ       ***
    000830     02  TERMID                   PIC  X(04).   */
    private X truckoTermid=trucko.makeX("TERMID",4);  /* offset in record:89 (0x59) */

/*  000840*                                           >>>  ÀÝÏÂ ID       ***
    000850     02  KOUSIN                   PIC  S9(13) COMP-3.   */
    private PackedDecimal truckoKousin=trucko.makePackedDecimal("KOUSIN",13,0);  /* offset in record:93 (0x5d) */

/*  000450 01  IS1REC                       PIC S9(9) COMP VALUE ZERO.   */

    private SignedI is1rec=factory_.makeSignedI("IS1REC",4,0);

/*  000460 01  IS2REC                       PIC S9(9) COMP VALUE ZERO.   */

    private SignedI is2rec=factory_.makeSignedI("IS2REC",4,0);

/*  000470 01  OS1REC                       PIC S9(9) COMP VALUE ZERO.   */

    private SignedI os1rec=factory_.makeSignedI("OS1REC",4,0);

/*  000480 01  KAKUYM.   */

    private Group kakuym=factory_.makeGroup("KAKUYM");

/*  000490   02  KAKUYY                     PIC 9(4).   */
    private UnsignedZoned kakuyy=kakuym.makeUnsignedZoned("KAKUYY",4,0);

/*  000500   02  KAKUMM                     PIC 9(2).   */
    private UnsignedZoned kakumm=kakuym.makeUnsignedZoned("KAKUMM",2,0);

// ------ File variables -----------------------------------------


  private SequentialFile kakutiFil=new SequentialFile("IS02",kakuti);

  private SequentialFile truckiFil=new SequentialFile("IS01",trucki);

  private SequentialFile truckoFil=new SequentialFile("OS01",trucko);

/*  000010 IDENTIFICATION DIVISION.
    000020 PROGRAM-ID.            AC7003.
    000030 AUTHOR.                S-YAMADA.
    000040 DATE-WRITTEN.          1993-06-22.   */

/*  000050*REMARKS.
    000060******************************************************************
    000070**            Ä × Â ¸ ËÞ Ý Ï ½ À - º ³ ¼ Ý
    000080******************************************************************
    000090*1998-03-23  NEW ºÝÊß²× À²µ³                                   T.T
    000100*2001-12-19  IS01 READ¼ÖØ ¶²¾ÞÝ                                T.T
    000110*2003-03-21  Ú²±³Ä ÍÝº³ À²µ³(DN-KBNÂ²¶)                        T.T
    000111*2016-01-26  »-ËÞ½²×²NO.091242 Ö³¾·ÏÄÒ·É³Â²¶ º³Ó¸ÌÖ         Y.MORI
    000120 ENVIRONMENT DIVISION.
    000130 CONFIGURATION SECTION.
    000140 SOURCE-COMPUTER.       IBM-3090.
    000150 OBJECT-COMPUTER.       IBM-3090.
    000160 INPUT-OUTPUT SECTION.
    000170 FILE-CONTROL.   */

/*  000180     SELECT TRUCKI-FIL ASSIGN TO UT-S-IS01.   */

/*  000190     SELECT KAKUTI-FIL ASSIGN TO UT-S-IS02.   */

/*  000200     SELECT TRUCKO-FIL ASSIGN TO UT-S-OS01.   */

/*  000210 DATA DIVISION.   */

/*  000220 FILE SECTION.   */

/*  000440 WORKING-STORAGE SECTION.   */

/*  000520 PROCEDURE DIVISION.   */

// ----------------- MAIN ENTRY POINT ----------------------------------------------------

  @Override
  public CobolDelegate cobolMain() throws Exception {

/*  000530     PERFORM B1               THRU B1-99.   */
    perform(B1,B1_99);

/*  000540*                                 >>>  ²Æ¼ÔÙ ¼ÖØ               ***
    000550     PERFORM B2               THRU B2-99
    000560              UNTIL TRUCKI = HIGH-VALUE.   */
    while(!trucki.equalTo(HIGH_VALUE))
      perform(B2,B2_99);

/*  000570*                                 >>>  Ò²Ý ¼ÖØ                 ***
    000580     PERFORM B3               THRU B3-99.   */
    perform(B3,B3_99);

/*  000590*                                 >>>  ´ÝÄÞ ¼ÖØ                ***
    000600     GOBACK.   */
    goBack();
    perform(B1,WTRUCKO_99);
    return null;
  }

/*000620***           ² Æ ¼ Ô Ù ¼ Ö Ø                                  ***
  000630 B1.   */

  private static final CobolDelegate B1=getDelegate("b1");
  public CobolDelegate b1() throws Exception { // paragraph

/*  000640     DISPLAY '*****  AC7003  *****'.   */
    display("*****  AC7003  *****");

/*  000650     OPEN INPUT  TRUCKI-FIL.   */
    truckiFil.openInput();

/*  000660     OPEN INPUT  KAKUTI-FIL.   */
    kakutiFil.openInput();

/*  000670     OPEN OUTPUT TRUCKO-FIL.   */
    truckoFil.openOutput();

/*  000680     PERFORM RTRUCKI          THRU RTRUCKI-99.   */
    perform(RTRUCKI,RTRUCKI_99);

/*  000690*                                 >>>  IS01 READ ¼ÖØ           ***
    000700     PERFORM RKAKUTI          THRU RKAKUTI-99.   */
    perform(RKAKUTI,RKAKUTI_99);

/*  000710*                                 >>>  IS02 READ ¼ÖØ           ***
    000720     IF KAKUTI = HIGH-VALUE   */

    if(kakuti.equalTo(HIGH_VALUE)) {

/*    000730              DISPLAY '¶¸Ã²·¶ÝÏ½À-¶Þ±ØÏ¾Ý'   */
      display("¶¸Ã²·¶ÝÏ½À-¶Þ±ØÏ¾Ý");

/*    000740              CALL 'ABORT'   */
      call("ABORT");
    }

/*  000750     ELSE   */
    else {

/*    000760              NEXT SENTENCE.   */
    }
    return null;
  }

/*000770 B1-99.   */

  private static final CobolDelegate B1_99=getDelegate("b1_99",B1);
  public CobolDelegate b1_99() throws Exception { // paragraph

/*  000780     EXIT.   */
    return null;
  }

/*000790***           Ò ² Ý ¼ Ö Ø                                      ***
  000800 B2.   */

  private static final CobolDelegate B2=getDelegate("b2",B1_99);
  public CobolDelegate b2() throws Exception { // paragraph

/*  000810     PERFORM B21              THRU B21-99.   */
    perform(B21,B21_99);

/*  000820*                                 >>>  ¼Þ¶² ¶²¼ Á´Â¸           ***
    000830     PERFORM RTRUCKI          THRU RTRUCKI-99.   */
    perform(RTRUCKI,RTRUCKI_99);
    return null;
  }

/*000840*                                 >>>  IS01 READ ¼ÖØ           ***
  000850 B2-99.   */

  private static final CobolDelegate B2_99=getDelegate("b2_99",B2);
  public CobolDelegate b2_99() throws Exception { // paragraph

/*  000860     EXIT.   */
    return null;
  }

/*000870***           Ä×Â¸ËÞÝÏ½À- ¼Þ¶²¶²¼ Á´Â¸                         ***
  000880 B21.   */

  private static final CobolDelegate B21=getDelegate("b21",B2_99);
  public CobolDelegate b21() throws Exception { // paragraph

/*  000890     IF J-KAIS IN TRUCKI = ZERO   */

    if(jKais.equalTo(ZERO)) {

/*    000900              PERFORM K1      THRU K1-99   */
      perform(K1,K1_99);

/*    000910*                                 >>>  IS01¦OS01Æ¾ÂÄ           ***
      000920              PERFORM WTRUCKO THRU WTRUCKO-99   */
      perform(WTRUCKO,WTRUCKO_99);
    }

/*  000930*                                 >>>  OS01 WRITE ¼ÖØ          ***
    000940     ELSE   */
    else {

/*    000950              PERFORM B211    THRU B211-99.   */
      perform(B211,B211_99);
    }
    return null;
  }

/*000960*                                 >>>  MAX¼ÞÕ³ØÖ³ Á´Â¸         ***
  000970 B21-99.   */

  private static final CobolDelegate B21_99=getDelegate("b21_99",B21);
  public CobolDelegate b21_99() throws Exception { // paragraph

/*  000980     EXIT.   */
    return null;
  }

/*000990***           Ä×Â¸ËÞÝÏ½À- MAX¼ÞÕ³ØÖ³Á´Â¸                       ***
  001000 B211.   */

  private static final CobolDelegate B211=getDelegate("b211",B21_99);
  public CobolDelegate b211() throws Exception { // paragraph

/*  001010     IF J-MAXW IN TRUCKI > ZERO   */

    if(jMaxw.greaterThan(ZERO)) {

/*    001020              PERFORM B2111   THRU B2111-99   */
      perform(B2111,B2111_99);

/*    001030*                                 >>>  IS01Ä IS02É Ë¶¸Äº³Ó¸¾ÂÄ ***
      001040              PERFORM WTRUCKO THRU WTRUCKO-99   */
      perform(WTRUCKO,WTRUCKO_99);
    }

/*  001050*                                 >>>  OS01 WRITE ¼ÖØ
    001060     ELSE   */
    else {

/*    001070              MOVE KAKUSY IN KAKUTI TO KAKUYY IN KAKUYM   */
      kakuyy.assign(kakusy);

/*    001080              MOVE KAKUSM IN KAKUTI TO KAKUMM IN KAKUYM   */
      kakumm.assign(kakusm);

/*    001090       IF J-KAIS IN TRUCKI > KAKUYM   */

      if(jKais.greaterThan(kakuym)) {

/*      001100              PERFORM K1      THRU K1-99   */
        perform(K1,K1_99);

/*      001110              PERFORM WTRUCKO THRU WTRUCKO-99   */
        perform(WTRUCKO,WTRUCKO_99);
      }

/*    001120*                                 >>>  OS01 WRITE ¼ÖØ          ***
      001130       ELSE   */
      else {

/*      001140              NEXT SENTENCE.   */
      }
    }
    return null;
  }

/*001150 B211-99.   */

  private static final CobolDelegate B211_99=getDelegate("b211_99",B211);
  public CobolDelegate b211_99() throws Exception { // paragraph

/*  001160     EXIT.   */
    return null;
  }

/*001170***           IS01 Ä IS02 É Ë¶¸ Ä º³Ó¸¾ÂÄ                      ***
  001180 B2111.   */

  private static final CobolDelegate B2111=getDelegate("b2111",B211_99);
  public CobolDelegate b2111() throws Exception { // paragraph

/*  001190     MOVE KAKUSY IN KAKUTI TO KAKUYY IN KAKUYM.   */
    kakuyy.assign(kakusy);

/*  001200     MOVE KAKUSM IN KAKUTI TO KAKUMM IN KAKUYM.   */
    kakumm.assign(kakusm);

/*  001210     IF J-KAIS IN TRUCKI > KAKUYM   */

    if(jKais.greaterThan(kakuym)) {

/*    001220              PERFORM K1      THRU K1-99   */
      perform(K1,K1_99);
    }

/*  001230*                                 >>>  IS01 ¦ OS01 Æ ¾ÂÄ       ***
    001240     ELSE   */
    else {

/*    001250              MOVE SPACE            TO TRUCKO   */
      trucko.assign(SPACE);

/*    001260              MOVE DATAID IN TRUCKI TO DATAID IN TRUCKO   */
      truckoDataid.assign(dataid);

/*    001270              MOVE VSAMKY IN TRUCKI TO VSAMKY IN TRUCKO   */
      truckoVsamky.assign(vsamky);

/*    001280** 20030321 *
      001290              MOVE DN-KBN IN TRUCKI TO DN-KBN IN TRUCKO   */
      truckoDnKbn.assign(dnKbn);

/*    001300** 20030321 *
      001310              MOVE JIKAII IN TRUCKI TO KONKAI IN TRUCKO   */
      truckoKonkai.assign(jikaii);

/*    001320              MOVE SPACE            TO JIKAII IN TRUCKO   */
      truckoJikaii.assign(SPACE);

/*    001330              MOVE ZERO             TO J-KAIS IN TRUCKO   */
      jikaiiJKais.assign(ZERO);

/*    001340              MOVE ZERO             TO J-SHUR IN TRUCKO   */
      jikaiiJShur.assign(ZERO);

/*    001350              MOVE ZERO             TO J-HATJ IN TRUCKO   */
      jikaiiJHatj.assign(ZERO);

/*    001360              MOVE ZERO             TO J-CHKJ IN TRUCKO   */
      jikaiiJChkj.assign(ZERO);

/*    001370              MOVE ZERO             TO J-MAXW IN TRUCKO   */
      jikaiiJMaxw.assign(ZERO);

/*    001371*** 2016-01-27 START *********************************************
      001372              MOVE KMAXVL IN TRUCKI TO KMAXVL IN TRUCKO   */
      knKaiKmaxvl.assign(kmaxvl);

/*    001373              MOVE ZERO             TO JMAXVL IN TRUCKO   */
      jiKaiJmaxvl.assign(ZERO);

/*    001374*** 2016-01-27 E N D *********************************************
      001380              MOVE PASWOD IN TRUCKI TO PASWOD IN TRUCKO   */
      truckoPaswod.assign(paswod);

/*    001390              MOVE TERMID IN TRUCKI TO TERMID IN TRUCKO   */
      truckoTermid.assign(termid);

/*    001400              MOVE KOUSIN IN TRUCKI TO KOUSIN IN TRUCKO.   */
      truckoKousin.assign(kousin);
    }
    return null;
  }

/*001410 B2111-99.   */

  private static final CobolDelegate B2111_99=getDelegate("b2111_99",B2111);
  public CobolDelegate b2111_99() throws Exception { // paragraph

/*  001420     EXIT.   */
    return null;
  }

/*001430***           ´ Ý ÄÞ ¼ Ö Ø                                     ***
  001440 B3.   */

  private static final CobolDelegate B3=getDelegate("b3",B2111_99);
  public CobolDelegate b3() throws Exception { // paragraph

/*  001450     CLOSE TRUCKI-FIL.   */
    truckiFil.close();

/*  001460     CLOSE KAKUTI-FIL.   */
    kakutiFil.close();

/*  001470     CLOSE TRUCKO-FIL.   */
    truckoFil.close();

/*  001480     DISPLAY 'Ä×Â¸ËÞÝÏ½À-(IS01)REC=' IS1REC.   */
    display("Ä×Â¸ËÞÝÏ½À-(IS01)REC=",is1rec);

/*  001490     DISPLAY '¶¸Ã²·¶ÝÏ½À-(IS02)REC=' IS2REC.   */
    display("¶¸Ã²·¶ÝÏ½À-(IS02)REC=",is2rec);

/*  001500     DISPLAY 'Ä×Â¸ËÞÝÏ½À-(OS01)REC=' OS1REC.   */
    display("Ä×Â¸ËÞÝÏ½À-(OS01)REC=",os1rec);
    return null;
  }

/*001510 B3-99.   */

  private static final CobolDelegate B3_99=getDelegate("b3_99",B3);
  public CobolDelegate b3_99() throws Exception { // paragraph

/*  001520     EXIT.   */
    return null;
  }

/*001530***           IS01 ¦ OS01 Æ ¾ÂÄ                                ***
  001540 K1.   */

  private static final CobolDelegate K1=getDelegate("k1",B3_99);
  public CobolDelegate k1() throws Exception { // paragraph

/*  001541*** 2016-01-27 START *********************************************
    001542     MOVE SPACE            TO TRUCKO.   */
    trucko.assign(SPACE);

/*  001543*** 2016-01-27 E N D *********************************************
    001550     MOVE DATAID IN TRUCKI TO DATAID IN TRUCKO.   */
    truckoDataid.assign(dataid);

/*  001560     MOVE VSAMKY IN TRUCKI TO VSAMKY IN TRUCKO.   */
    truckoVsamky.assign(vsamky);

/*  001570** 20030321 *
    001580     MOVE DN-KBN IN TRUCKI TO DN-KBN IN TRUCKO.   */
    truckoDnKbn.assign(dnKbn);

/*  001590** 20030321 *
    001600     MOVE KONKAI IN TRUCKI TO KONKAI IN TRUCKO.   */
    truckoKonkai.assign(konkai);

/*  001610     MOVE JIKAII IN TRUCKI TO JIKAII IN TRUCKO.   */
    truckoJikaii.assign(jikaii);

/*  001611*** 2016-01-27 START *********************************************
    001612     MOVE KMAXVL IN TRUCKI TO KMAXVL IN TRUCKO   */
    knKaiKmaxvl.assign(kmaxvl);

/*  001613     MOVE JMAXVL IN TRUCKI TO JMAXVL IN TRUCKO   */
    jiKaiJmaxvl.assign(jmaxvl);

/*  001614*** 2016-01-27 E N D *********************************************
    001620     MOVE PASWOD IN TRUCKI TO PASWOD IN TRUCKO.   */
    truckoPaswod.assign(paswod);

/*  001630     MOVE TERMID IN TRUCKI TO TERMID IN TRUCKO.   */
    truckoTermid.assign(termid);

/*  001640     MOVE KOUSIN IN TRUCKI TO KOUSIN IN TRUCKO.   */
    truckoKousin.assign(kousin);
    return null;
  }

/*001650 K1-99.   */

  private static final CobolDelegate K1_99=getDelegate("k1_99",K1);
  public CobolDelegate k1_99() throws Exception { // paragraph

/*  001660     EXIT.   */
    return null;
  }

/*001670***           IS01 READ ¼ÖØ                                    ***
  001680 RTRUCKI.   */

  private static final CobolDelegate RTRUCKI=getDelegate("rtrucki",K1_99);
  public CobolDelegate rtrucki() throws Exception { // paragraph

    if(truckiFil.readNext()) {

/*  001690     READ TRUCKI-FIL AT END   */

/*    001700              MOVE HIGH-VALUE TO TRUCKI   */
      trucki.assign(HIGH_VALUE);

/*    001710              GO TO RTRUCKI-99.   */
      return RTRUCKI_99;
    }

/*  001720*****IF MASTKB IN TRUCKI = 'B'
    001730*****         COMPUTE IS1REC = IS1REC + 1
    001740*****ELSE
    001750*****         GO TO RTRUCKI.
    001760     COMPUTE IS1REC = IS1REC + 1   */
    is1rec.assign(is1rec.add(1));

/*  001770     IF MASTKB IN TRUCKI = 'B'   */

    if(mastkb.equalTo("B")) {

/*    001780              NEXT SENTENCE   */
    }

/*  001790     ELSE   */
    else {

/*    001800              MOVE TRUCKI TO TRUCKO   */
      trucko.assign(trucki);

/*    001810              PERFORM WTRUCKO THRU WTRUCKO-99   */
      perform(WTRUCKO,WTRUCKO_99);

/*    001820              GO TO RTRUCKI.   */
      return RTRUCKI;
    }
    return null;
  }

/*001830 RTRUCKI-99.   */

  private static final CobolDelegate RTRUCKI_99=getDelegate("rtrucki_99",RTRUCKI);
  public CobolDelegate rtrucki_99() throws Exception { // paragraph

/*  001840     EXIT.   */
    return null;
  }

/*001850***           IS02 READ ¼ÖØ                                    ***
  001860 RKAKUTI.   */

  private static final CobolDelegate RKAKUTI=getDelegate("rkakuti",RTRUCKI_99);
  public CobolDelegate rkakuti() throws Exception { // paragraph

    if(kakutiFil.readNext()) {

/*  001870     READ KAKUTI-FIL AT END   */

/*    001880              MOVE HIGH-VALUE TO KAKUTI   */
      kakuti.assign(HIGH_VALUE);

/*    001890              GO TO RKAKUTI-99.   */
      return RKAKUTI_99;
    }

/*  001900     COMPUTE IS2REC = IS2REC + 1.   */
    is2rec.assign(is2rec.add(1));
    return null;
  }

/*001910 RKAKUTI-99.   */

  private static final CobolDelegate RKAKUTI_99=getDelegate("rkakuti_99",RKAKUTI);
  public CobolDelegate rkakuti_99() throws Exception { // paragraph

/*  001920     EXIT.   */
    return null;
  }

/*001930***           OS01 WRITE ¼ÖØ                                   ***
  001940 WTRUCKO.   */

  private static final CobolDelegate WTRUCKO=getDelegate("wtrucko",RKAKUTI_99);
  public CobolDelegate wtrucko() throws Exception { // paragraph

/*  001950     WRITE TRUCKO.   */
    truckoFil.write(trucko);

/*  001960     COMPUTE OS1REC = OS1REC + 1.   */
    os1rec.assign(os1rec.add(1));
    return null;
  }

/*001970 WTRUCKO-99.   */

  private static final CobolDelegate WTRUCKO_99=getDelegate("wtrucko_99",WTRUCKO);
  public CobolDelegate wtrucko_99() throws Exception { // paragraph

/*  001980     EXIT.   */
    return null;
  }
  @Override
  public A getProgramName() { return PROGRAM; }

  public static void main(String[] _arg) throws Exception { CobolSession.run(Ac7003.class); }
}
