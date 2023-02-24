/*
 * Copyright (C) 2021 JCSchneider
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package CSHashMap;

import CSComparableVsComparator.Student;
import java.util.ArrayList;

/**
 *
 * @author JCSchneider
 */
public class BigHashMapTest {

    public static void main(String[] args) {
        //HashMapOpen<Integer, Student> HashStudent = new HashMapOpen<>();
        HashMapChain<Integer, Student> HashStudent = new HashMapChain<>();
        
        ArrayList<Student> studentList = createStudentList();

        for (Student student : studentList) {
           // System.out.println(student.hashCode());
            HashStudent.put(student.hashCode(), student);
            System.out.println(student);
        }
        System.out.println("Size: " + HashStudent.size());        
        //System.out.println("Get -272: " + HashStudent.get(-272));
        //System.out.println("Get -272: " + HashStudent.get(2065661072));
          Integer thatOne = new Student(1,"MEJIA",1).hashCode();
            System.out.println("Getting MEJIA: " + HashStudent.get(thatOne));
//        Integer thatOne = new Student(1, "SMITH", 61).hashCode();
//        System.out.println("Getting SMITH: " + HashStudent.get(thatOne));
        
    }

    protected static ArrayList<Student> createStudentList() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "SMITH", 61));
        studentList.add(new Student(2, "JOHNSON", 58));
        studentList.add(new Student(3, "WILLIAMS", 42));
        studentList.add(new Student(4, "BROWN", 91));
        studentList.add(new Student(5, "JONES", 32));
        studentList.add(new Student(6, "GARCIA", 80));
        studentList.add(new Student(7, "MILLER", 62));
        studentList.add(new Student(8, "DAVIS", 46));
        studentList.add(new Student(9, "RODRIGUEZ", 49));
        studentList.add(new Student(10, "MARTINEZ", 21));
        studentList.add(new Student(11, "HERNANDEZ", 60));
        studentList.add(new Student(12, "LOPEZ", 80));
        studentList.add(new Student(13, "GONZALEZ", 27));
        studentList.add(new Student(14, "WILSON", 85));
        studentList.add(new Student(15, "ANDERSON", 29));
        studentList.add(new Student(16, "THOMAS", 45));
        studentList.add(new Student(17, "TAYLOR", 81));
        studentList.add(new Student(18, "MOORE", 72));
        studentList.add(new Student(19, "JACKSON", 43));
        studentList.add(new Student(20, "MARTIN", 63));
        studentList.add(new Student(21, "LEE", 50));
        studentList.add(new Student(22, "PEREZ", 32));
        studentList.add(new Student(23, "THOMPSON", 83));
        studentList.add(new Student(24, "WHITE", 44));
        studentList.add(new Student(25, "HARRIS", 97));
        studentList.add(new Student(26, "SANCHEZ", 84));
        studentList.add(new Student(27, "CLARK", 41));
        studentList.add(new Student(28, "RAMIREZ", 26));
        studentList.add(new Student(29, "LEWIS", 44));
        studentList.add(new Student(30, "ROBINSON", 98));
        studentList.add(new Student(31, "WALKER", 68));
        studentList.add(new Student(32, "YOUNG", 64));
        studentList.add(new Student(33, "ALLEN", 39));
        studentList.add(new Student(34, "KING", 63));
        studentList.add(new Student(35, "WRIGHT", 59));
        studentList.add(new Student(36, "SCOTT", 25));
        studentList.add(new Student(37, "TORRES", 56));
        studentList.add(new Student(38, "NGUYEN", 72));
        studentList.add(new Student(39, "HILL", 83));
        studentList.add(new Student(40, "FLORES", 95));
        studentList.add(new Student(41, "GREEN", 57));
        studentList.add(new Student(42, "ADAMS", 99));
        studentList.add(new Student(43, "NELSON", 49));
        studentList.add(new Student(44, "BAKER", 61));
        studentList.add(new Student(45, "HALL", 38));
        studentList.add(new Student(46, "RIVERA", 43));
        studentList.add(new Student(47, "CAMPBELL", 30));
        studentList.add(new Student(48, "MITCHELL", 92));
        studentList.add(new Student(49, "CARTER", 74));
        studentList.add(new Student(50, "ROBERTS", 30));
        studentList.add(new Student(51, "GOMEZ", 65));
        studentList.add(new Student(52, "PHILLIPS", 49));
        studentList.add(new Student(53, "EVANS", 20));
        studentList.add(new Student(54, "TURNER", 23));
        studentList.add(new Student(55, "DIAZ", 96));
        studentList.add(new Student(56, "PARKER", 50));
        studentList.add(new Student(57, "CRUZ", 40));
        studentList.add(new Student(58, "EDWARDS", 25));
        studentList.add(new Student(59, "COLLINS", 77));
        studentList.add(new Student(60, "REYES", 43));
        studentList.add(new Student(61, "STEWART", 92));
        studentList.add(new Student(62, "MORRIS", 96));
        studentList.add(new Student(63, "MORALES", 97));
        studentList.add(new Student(64, "MURPHY", 88));
        studentList.add(new Student(65, "COOK", 44));
        studentList.add(new Student(66, "ROGERS", 77));
        studentList.add(new Student(67, "GUTIERREZ", 51));
        studentList.add(new Student(68, "ORTIZ", 41));
        studentList.add(new Student(69, "MORGAN", 45));
        studentList.add(new Student(70, "COOPER", 50));
        studentList.add(new Student(71, "PETERSON", 97));
        studentList.add(new Student(72, "BAILEY", 69));
        studentList.add(new Student(73, "REED", 54));
        studentList.add(new Student(74, "KELLY", 31));
        studentList.add(new Student(75, "HOWARD", 96));
        studentList.add(new Student(76, "RAMOS", 39));
        studentList.add(new Student(77, "KIM", 71));
        studentList.add(new Student(78, "COX", 24));
        studentList.add(new Student(79, "WARD", 90));
        studentList.add(new Student(80, "RICHARDSON", 33));
        studentList.add(new Student(81, "WATSON", 35));
        studentList.add(new Student(82, "BROOKS", 23));
        studentList.add(new Student(83, "CHAVEZ", 28));
        studentList.add(new Student(84, "WOOD", 24));
        studentList.add(new Student(85, "JAMES", 23));
        studentList.add(new Student(86, "BENNETT", 40));
        studentList.add(new Student(87, "GRAY", 23));
        studentList.add(new Student(88, "MENDOZA", 64));
        studentList.add(new Student(89, "RUIZ", 28));
        studentList.add(new Student(90, "HUGHES", 27));
        studentList.add(new Student(91, "PRICE", 27));
        studentList.add(new Student(92, "ALVAREZ", 72));
        studentList.add(new Student(93, "CASTILLO", 88));
        studentList.add(new Student(94, "SANDERS", 61));
        studentList.add(new Student(95, "PATEL", 64));
        studentList.add(new Student(96, "MYERS", 87));
        studentList.add(new Student(97, "LONG", 43));
        studentList.add(new Student(98, "ROSS", 39));
        studentList.add(new Student(99, "FOSTER", 20));
        studentList.add(new Student(100, "JIMENEZ", 38));
        studentList.add(new Student(101, "POWELL", 34));
        studentList.add(new Student(102, "JENKINS", 68));
        studentList.add(new Student(103, "PERRY", 20));
        studentList.add(new Student(104, "RUSSELL", 49));
        studentList.add(new Student(105, "SULLIVAN", 54));
        studentList.add(new Student(106, "BELL", 61));
        studentList.add(new Student(107, "COLEMAN", 20));
        studentList.add(new Student(108, "BUTLER", 54));
        studentList.add(new Student(109, "HENDERSON", 22));
        studentList.add(new Student(110, "BARNES", 37));
        studentList.add(new Student(111, "GONZALES", 49));
        studentList.add(new Student(112, "FISHER", 36));
        studentList.add(new Student(113, "VASQUEZ", 39));
        studentList.add(new Student(114, "SIMMONS", 62));
        studentList.add(new Student(115, "ROMERO", 60));
        studentList.add(new Student(116, "JORDAN", 53));
        studentList.add(new Student(117, "PATTERSON", 59));
        studentList.add(new Student(118, "ALEXANDER", 99));
        studentList.add(new Student(119, "HAMILTON", 34));
        studentList.add(new Student(120, "GRAHAM", 84));
        studentList.add(new Student(121, "REYNOLDS", 61));
        studentList.add(new Student(122, "GRIFFIN", 61));
        studentList.add(new Student(123, "WALLACE", 42));
        studentList.add(new Student(124, "MORENO", 86));
        studentList.add(new Student(125, "WEST", 57));
        studentList.add(new Student(126, "COLE", 55));
        studentList.add(new Student(127, "HAYES", 72));
        studentList.add(new Student(128, "BRYANT", 76));
        studentList.add(new Student(129, "HERRERA", 25));
        studentList.add(new Student(130, "GIBSON", 96));
        studentList.add(new Student(131, "ELLIS", 77));
        studentList.add(new Student(132, "TRAN", 62));
        studentList.add(new Student(133, "MEDINA", 49));
        studentList.add(new Student(134, "AGUILAR", 82));
        studentList.add(new Student(135, "STEVENS", 89));
        studentList.add(new Student(136, "MURRAY", 49));
        studentList.add(new Student(137, "FORD", 20));
        studentList.add(new Student(138, "CASTRO", 81));
        studentList.add(new Student(139, "MARSHALL", 59));
        studentList.add(new Student(140, "OWENS", 71));
        studentList.add(new Student(141, "HARRISON", 44));
        studentList.add(new Student(142, "FERNANDEZ", 88));
        studentList.add(new Student(143, "McDONALD", 76));
        studentList.add(new Student(144, "WOODS", 81));
        studentList.add(new Student(145, "WASHINGTON", 99));
        studentList.add(new Student(146, "KENNEDY", 72));        
        studentList.add(new Student(148, "VARGAS", 86));
        studentList.add(new Student(149, "HENRY", 37));
        studentList.add(new Student(150, "CHEN", 63));
        studentList.add(new Student(151, "FREEMAN", 47));
        studentList.add(new Student(152, "WEBB", 28));
        studentList.add(new Student(153, "TUCKER", 85));
        studentList.add(new Student(154, "GUZMAN", 71));
        studentList.add(new Student(155, "BURNS", 68));
        studentList.add(new Student(156, "CRAWFORD", 53));
        studentList.add(new Student(157, "OLSON", 57));
        studentList.add(new Student(158, "SIMPSON", 36));
        studentList.add(new Student(159, "PORTER", 53));
        studentList.add(new Student(160, "HUNTER", 46));
        studentList.add(new Student(161, "GORDON", 81));
        studentList.add(new Student(162, "MENDEZ", 34));
        studentList.add(new Student(163, "SILVA", 64));
        studentList.add(new Student(164, "SHAW", 47));
        studentList.add(new Student(165, "SNYDER", 36));
        studentList.add(new Student(166, "MASON", 54));
        studentList.add(new Student(167, "DIXON", 40));
        studentList.add(new Student(168, "MUÑOZ", 25));
        studentList.add(new Student(169, "HUNT", 54));
        studentList.add(new Student(170, "HICKS", 57));
        studentList.add(new Student(171, "HOLMES", 43));
        studentList.add(new Student(172, "PALMER", 41));
        studentList.add(new Student(173, "WAGNER", 52));
        studentList.add(new Student(174, "BLACK", 65));
        studentList.add(new Student(175, "ROBERTSON", 98));
        studentList.add(new Student(176, "BOYD", 39));
        studentList.add(new Student(177, "ROSE", 50));
        studentList.add(new Student(178, "STONE", 55));
        studentList.add(new Student(179, "SALAZAR", 86));
        studentList.add(new Student(180, "FOX", 56));
        studentList.add(new Student(181, "WARREN", 35));
        studentList.add(new Student(182, "MILLS", 59));
        studentList.add(new Student(183, "MEYER", 43));
        studentList.add(new Student(184, "RICE", 67));
        studentList.add(new Student(185, "SCHMIDT", 36));
        studentList.add(new Student(186, "GARZA", 93));
        studentList.add(new Student(187, "DANIELS", 29));
        studentList.add(new Student(188, "FERGUSON", 93));
        studentList.add(new Student(189, "NICHOLS", 21));
        studentList.add(new Student(190, "STEPHENS", 53));
        studentList.add(new Student(191, "SOTO", 25));
        studentList.add(new Student(192, "WEAVER", 97));
        studentList.add(new Student(193, "RYAN", 51));
        studentList.add(new Student(194, "GARDNER", 74));
        studentList.add(new Student(195, "PAYNE", 71));
        studentList.add(new Student(196, "GRANT", 59));
        studentList.add(new Student(197, "DUNN", 78));
        studentList.add(new Student(198, "KELLEY", 86));
        studentList.add(new Student(199, "SPENCER", 23));
        studentList.add(new Student(200, "HAWKINS", 20));
        studentList.add(new Student(201, "ARNOLD", 75));
        studentList.add(new Student(202, "PIERCE", 98));
        studentList.add(new Student(203, "VAZQUEZ", 79));
        studentList.add(new Student(204, "HANSEN", 86));
        studentList.add(new Student(205, "PETERS", 89));
        studentList.add(new Student(206, "SANTOS", 58));
        studentList.add(new Student(207, "HART", 83));
        studentList.add(new Student(208, "BRADLEY", 38));
        studentList.add(new Student(209, "KNIGHT", 35));
        studentList.add(new Student(210, "ELLIOTT", 56));
        studentList.add(new Student(211, "CUNNINGHAM", 72));
        studentList.add(new Student(212, "DUNCAN", 87));
        studentList.add(new Student(213, "ARMSTRONG", 39));
        studentList.add(new Student(214, "HUDSON", 93));
        studentList.add(new Student(215, "CARROLL", 91));
        studentList.add(new Student(216, "LANE", 26));
        studentList.add(new Student(217, "RILEY", 45));
        studentList.add(new Student(218, "ANDREWS", 60));
        studentList.add(new Student(219, "ALVARADO", 60));
        studentList.add(new Student(220, "RAY", 27));
        studentList.add(new Student(221, "DELGADO", 46));
        studentList.add(new Student(222, "BERRY", 34));
        studentList.add(new Student(223, "PERKINS", 83));
        studentList.add(new Student(224, "HOFFMAN", 65));
        studentList.add(new Student(225, "JOHNSTON", 27));
        studentList.add(new Student(226, "MATTHEWS", 70));
        studentList.add(new Student(227, "PEÑA", 59));
        studentList.add(new Student(228, "RICHARDS", 86));
        studentList.add(new Student(229, "CONTRERAS", 62));
        studentList.add(new Student(230, "WILLIS", 67));
        studentList.add(new Student(231, "CARPENTER", 31));
        studentList.add(new Student(232, "LAWRENCE", 48));
        studentList.add(new Student(233, "SANDOVAL", 41));
        studentList.add(new Student(234, "GUERRERO", 22));
        studentList.add(new Student(235, "GEORGE", 59));
        studentList.add(new Student(236, "CHAPMAN", 22));
        studentList.add(new Student(237, "RIOS", 33));
        studentList.add(new Student(238, "ESTRADA", 32));
        studentList.add(new Student(239, "ORTEGA", 62));
        studentList.add(new Student(240, "WATKINS", 57));
        studentList.add(new Student(241, "GREENE", 70));
        studentList.add(new Student(242, "NUÑEZ", 91));
        studentList.add(new Student(243, "WHEELER", 32));
        studentList.add(new Student(244, "VALDEZ", 35));
        studentList.add(new Student(245, "HARPER", 25));
        studentList.add(new Student(246, "BURKE", 60));
        studentList.add(new Student(247, "LARSON", 99));
        studentList.add(new Student(248, "SANTIAGO", 58));
        studentList.add(new Student(249, "MALDONADO", 95));
        studentList.add(new Student(250, "MORRISON", 43));
        studentList.add(new Student(251, "FRANKLIN", 88));
        studentList.add(new Student(252, "CARLSON", 27));
        studentList.add(new Student(253, "AUSTIN", 92));
        studentList.add(new Student(254, "DOMINGUEZ", 76));
        studentList.add(new Student(255, "CARR", 43));
        studentList.add(new Student(256, "LAWSON", 65));
        studentList.add(new Student(257, "JACOBS", 56));
        studentList.add(new Student(258, "O’BRIEN", 20));
        studentList.add(new Student(259, "LYNCH", 86));
        studentList.add(new Student(260, "SINGH", 99));
        studentList.add(new Student(261, "VEGA", 46));
        studentList.add(new Student(262, "BISHOP", 66));
        studentList.add(new Student(263, "MONTGOMERY", 48));
        studentList.add(new Student(264, "OLIVER", 55));
        studentList.add(new Student(265, "JENSEN", 53));
        studentList.add(new Student(266, "HARVEY", 38));
        studentList.add(new Student(267, "WILLIAMSON", 30));
        studentList.add(new Student(268, "GILBERT", 55));
        studentList.add(new Student(269, "DEAN", 42));
        studentList.add(new Student(270, "SIMS", 20));
        studentList.add(new Student(271, "ESPINOZA", 72));
        studentList.add(new Student(272, "HOWELL", 42));
        studentList.add(new Student(273, "LI", 56));
        studentList.add(new Student(274, "WONG", 71));
        studentList.add(new Student(275, "REID", 74));
        studentList.add(new Student(276, "HANSON", 59));
        studentList.add(new Student(277, "LE", 67));
        studentList.add(new Student(278, "McCOY", 90));
        studentList.add(new Student(279, "GARRETT", 35));
        studentList.add(new Student(280, "BURTON", 24));
        studentList.add(new Student(281, "FULLER", 24));
        studentList.add(new Student(282, "WANG", 27));
        studentList.add(new Student(283, "WEBER", 49));
        studentList.add(new Student(284, "WELCH", 83));
        studentList.add(new Student(285, "ROJAS", 48));
        studentList.add(new Student(286, "LUCAS", 50));
        studentList.add(new Student(287, "MARQUEZ", 27));
        studentList.add(new Student(288, "FIELDS", 40));
        studentList.add(new Student(289, "PARK", 37));
        studentList.add(new Student(290, "YANG", 33));
        studentList.add(new Student(291, "LITTLE", 63));
        studentList.add(new Student(292, "BANKS", 73));
        studentList.add(new Student(293, "PADILLA", 35));
        studentList.add(new Student(294, "DAY", 84));
        studentList.add(new Student(295, "WALSH", 22));
        studentList.add(new Student(296, "BOWMAN", 35));
        studentList.add(new Student(297, "SCHULTZ", 40));
        studentList.add(new Student(298, "LUNA", 57));
        studentList.add(new Student(299, "FOWLER", 93));
        studentList.add(new Student(300, "MEJIA", 93));
        return studentList;
    }

}
