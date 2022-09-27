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
package CSBST;

import CSComparableVsComparator.StudentComparable;

/**
 *
 * @author JCSchneider
 */
public class BSTStudentTest {

    public static void main(String[] args) {

        BSTGeneric<StudentComparable> b = new BSTGeneric<>();
        getStudents(b);
//        b.preOrderTraversal();
        System.out.println("\nLeaves: " + b.countLeaves());

        System.out.println("\n" + b.contains(new StudentComparable(194, "GARDNER", 74)));

        System.out.println("\nfindMin " + b.findMin());
        System.out.println("\nfindMax " + b.findMax());
//        b.printAllPath();
//        b.printDepthFirst();
        System.out.println("\nLeaf nodes:");
        b.printLeafNodes();
        System.out.println("Remove Gardner");
        b.delete(new StudentComparable(194, "GARDNER", 74));

        
        System.out.println("Adding Joey where Gardner was.");
        StudentComparable Joey = new StudentComparable(194, "Joey", 74);

        b.add(Joey);
        System.out.println("\nContains Joey " + b.contains(Joey));
        System.out.println("\nContains Joey: " + Joey.getName() + " " + Joey.hashCode());

    }

    protected static void getStudents(BSTGeneric<StudentComparable> b) {
        b.add(new StudentComparable(1, "SMITH", 61));
        b.add(new StudentComparable(3, "WILLIAMS", 42));
        b.add(new StudentComparable(4, "BROWN", 91));
        b.add(new StudentComparable(2, "JOHNSON", 58));
        b.add(new StudentComparable(5, "JONES", 32));
        b.add(new StudentComparable(6, "GARCIA", 80));
        b.add(new StudentComparable(7, "MILLER", 62));
        b.add(new StudentComparable(8, "DAVIS", 46));
        b.add(new StudentComparable(9, "RODRIGUEZ", 49));
        b.add(new StudentComparable(10, "MARTINEZ", 21));
        b.add(new StudentComparable(11, "HERNANDEZ", 60));
        b.add(new StudentComparable(12, "LOPEZ", 80));
        b.add(new StudentComparable(13, "GONZALEZ", 27));
        b.add(new StudentComparable(14, "WILSON", 85));
        b.add(new StudentComparable(15, "ANDERSON", 29));
        b.add(new StudentComparable(16, "THOMAS", 45));
        b.add(new StudentComparable(17, "TAYLOR", 81));
        b.add(new StudentComparable(18, "MOORE", 72));
        b.add(new StudentComparable(19, "JACKSON", 43));
        b.add(new StudentComparable(20, "MARTIN", 63));
        b.add(new StudentComparable(21, "LEE", 50));
        b.add(new StudentComparable(22, "PEREZ", 32));
        b.add(new StudentComparable(23, "THOMPSON", 83));
        b.add(new StudentComparable(24, "WHITE", 44));
        b.add(new StudentComparable(25, "HARRIS", 97));
        b.add(new StudentComparable(26, "SANCHEZ", 84));
        b.add(new StudentComparable(27, "CLARK", 41));
        b.add(new StudentComparable(28, "RAMIREZ", 26));
        b.add(new StudentComparable(29, "LEWIS", 44));
        b.add(new StudentComparable(30, "ROBINSON", 98));
        b.add(new StudentComparable(31, "WALKER", 68));
        b.add(new StudentComparable(32, "YOUNG", 64));
        b.add(new StudentComparable(33, "ALLEN", 39));
        b.add(new StudentComparable(34, "KING", 63));
        b.add(new StudentComparable(35, "WRIGHT", 59));
        b.add(new StudentComparable(36, "SCOTT", 25));
        b.add(new StudentComparable(37, "TORRES", 56));
        b.add(new StudentComparable(38, "NGUYEN", 72));
        b.add(new StudentComparable(39, "HILL", 83));
        b.add(new StudentComparable(40, "FLORES", 95));
        b.add(new StudentComparable(41, "GREEN", 57));
        b.add(new StudentComparable(42, "ADAMS", 99));
        b.add(new StudentComparable(43, "NELSON", 49));
        b.add(new StudentComparable(44, "BAKER", 61));
        b.add(new StudentComparable(45, "HALL", 38));
        b.add(new StudentComparable(46, "RIVERA", 43));
        b.add(new StudentComparable(47, "CAMPBELL", 30));
        b.add(new StudentComparable(48, "MITCHELL", 92));
        b.add(new StudentComparable(49, "CARTER", 74));
        b.add(new StudentComparable(50, "ROBERTS", 30));
        b.add(new StudentComparable(51, "GOMEZ", 65));
        b.add(new StudentComparable(52, "PHILLIPS", 49));
        b.add(new StudentComparable(53, "EVANS", 20));
        b.add(new StudentComparable(54, "TURNER", 23));
        b.add(new StudentComparable(55, "DIAZ", 96));
        b.add(new StudentComparable(56, "PARKER", 50));
        b.add(new StudentComparable(57, "CRUZ", 40));
        b.add(new StudentComparable(58, "EDWARDS", 25));
        b.add(new StudentComparable(59, "COLLINS", 77));
        b.add(new StudentComparable(60, "REYES", 43));
        b.add(new StudentComparable(61, "STEWART", 92));
        b.add(new StudentComparable(62, "MORRIS", 96));
        b.add(new StudentComparable(63, "MORALES", 97));
        b.add(new StudentComparable(64, "MURPHY", 88));
        b.add(new StudentComparable(65, "COOK", 44));
        b.add(new StudentComparable(66, "ROGERS", 77));
        b.add(new StudentComparable(67, "GUTIERREZ", 51));
        b.add(new StudentComparable(68, "ORTIZ", 41));
        b.add(new StudentComparable(69, "MORGAN", 45));
        b.add(new StudentComparable(70, "COOPER", 50));
        b.add(new StudentComparable(71, "PETERSON", 97));
        b.add(new StudentComparable(72, "BAILEY", 69));
        b.add(new StudentComparable(73, "REED", 54));
        b.add(new StudentComparable(74, "KELLY", 31));
        b.add(new StudentComparable(75, "HOWARD", 96));
        b.add(new StudentComparable(76, "RAMOS", 39));
        b.add(new StudentComparable(77, "KIM", 71));
        b.add(new StudentComparable(78, "COX", 24));
        b.add(new StudentComparable(79, "WARD", 90));
        b.add(new StudentComparable(80, "RICHARDSON", 33));
        b.add(new StudentComparable(81, "WATSON", 35));
        b.add(new StudentComparable(82, "BROOKS", 23));
        b.add(new StudentComparable(83, "CHAVEZ", 28));
        b.add(new StudentComparable(84, "WOOD", 24));
        b.add(new StudentComparable(85, "JAMES", 23));
        b.add(new StudentComparable(86, "BENNETT", 40));
        b.add(new StudentComparable(87, "GRAY", 23));
        b.add(new StudentComparable(88, "MENDOZA", 64));
        b.add(new StudentComparable(89, "RUIZ", 28));
        b.add(new StudentComparable(90, "HUGHES", 27));
        b.add(new StudentComparable(91, "PRICE", 27));
        b.add(new StudentComparable(92, "ALVAREZ", 72));
        b.add(new StudentComparable(93, "CASTILLO", 88));
        b.add(new StudentComparable(94, "SANDERS", 61));
        b.add(new StudentComparable(95, "PATEL", 64));
        b.add(new StudentComparable(96, "MYERS", 87));
        b.add(new StudentComparable(97, "LONG", 43));
        b.add(new StudentComparable(98, "ROSS", 39));
        b.add(new StudentComparable(99, "FOSTER", 20));
        b.add(new StudentComparable(100, "JIMENEZ", 38));
        b.add(new StudentComparable(101, "POWELL", 34));
        b.add(new StudentComparable(102, "JENKINS", 68));
        b.add(new StudentComparable(103, "PERRY", 20));
        b.add(new StudentComparable(104, "RUSSELL", 49));
        b.add(new StudentComparable(105, "SULLIVAN", 54));
        b.add(new StudentComparable(106, "BELL", 61));
        b.add(new StudentComparable(107, "COLEMAN", 20));
        b.add(new StudentComparable(108, "BUTLER", 54));
        b.add(new StudentComparable(109, "HENDERSON", 22));
        b.add(new StudentComparable(110, "BARNES", 37));
        b.add(new StudentComparable(111, "GONZALES", 49));
        b.add(new StudentComparable(112, "FISHER", 36));
        b.add(new StudentComparable(113, "VASQUEZ", 39));
        b.add(new StudentComparable(114, "SIMMONS", 62));
        b.add(new StudentComparable(115, "ROMERO", 60));
        b.add(new StudentComparable(116, "JORDAN", 53));
        b.add(new StudentComparable(117, "PATTERSON", 59));
        b.add(new StudentComparable(118, "ALEXANDER", 99));
        b.add(new StudentComparable(119, "HAMILTON", 34));
        b.add(new StudentComparable(120, "GRAHAM", 84));
        b.add(new StudentComparable(121, "REYNOLDS", 61));
        b.add(new StudentComparable(122, "GRIFFIN", 61));
        b.add(new StudentComparable(123, "WALLACE", 42));
        b.add(new StudentComparable(124, "MORENO", 86));
        b.add(new StudentComparable(125, "WEST", 57));
        b.add(new StudentComparable(126, "COLE", 55));
        b.add(new StudentComparable(127, "HAYES", 72));
        b.add(new StudentComparable(128, "BRYANT", 76));
        b.add(new StudentComparable(129, "HERRERA", 25));
        b.add(new StudentComparable(130, "GIBSON", 96));
        b.add(new StudentComparable(131, "ELLIS", 77));
        b.add(new StudentComparable(132, "TRAN", 62));
        b.add(new StudentComparable(133, "MEDINA", 49));
        b.add(new StudentComparable(134, "AGUILAR", 82));
        b.add(new StudentComparable(135, "STEVENS", 89));
        b.add(new StudentComparable(136, "MURRAY", 49));
        b.add(new StudentComparable(137, "FORD", 20));
        b.add(new StudentComparable(138, "CASTRO", 81));
        b.add(new StudentComparable(139, "MARSHALL", 59));
        b.add(new StudentComparable(140, "OWENS", 71));
        b.add(new StudentComparable(141, "HARRISON", 44));
        b.add(new StudentComparable(142, "FERNANDEZ", 88));
        b.add(new StudentComparable(143, "McDONALD", 76));
        b.add(new StudentComparable(144, "WOODS", 81));
        b.add(new StudentComparable(145, "WASHINGTON", 99));
        b.add(new StudentComparable(146, "KENNEDY", 72));
        b.add(new StudentComparable(147, "WELLS", 90));
        b.add(new StudentComparable(148, "VARGAS", 86));
        b.add(new StudentComparable(149, "HENRY", 37));
        b.add(new StudentComparable(150, "CHEN", 63));
        b.add(new StudentComparable(151, "FREEMAN", 47));
        b.add(new StudentComparable(152, "WEBB", 28));
        b.add(new StudentComparable(153, "TUCKER", 85));
        b.add(new StudentComparable(154, "GUZMAN", 71));
        b.add(new StudentComparable(155, "BURNS", 68));
        b.add(new StudentComparable(156, "CRAWFORD", 53));
        b.add(new StudentComparable(157, "OLSON", 57));
        b.add(new StudentComparable(158, "SIMPSON", 36));
        b.add(new StudentComparable(159, "PORTER", 53));
        b.add(new StudentComparable(160, "HUNTER", 46));
        b.add(new StudentComparable(161, "GORDON", 81));
        b.add(new StudentComparable(162, "MENDEZ", 34));
        b.add(new StudentComparable(163, "SILVA", 64));
        b.add(new StudentComparable(164, "SHAW", 47));
        b.add(new StudentComparable(165, "SNYDER", 36));
        b.add(new StudentComparable(166, "MASON", 54));
        b.add(new StudentComparable(167, "DIXON", 40));
        b.add(new StudentComparable(168, "MUÑOZ", 25));
        b.add(new StudentComparable(169, "HUNT", 54));
        b.add(new StudentComparable(170, "HICKS", 57));
        b.add(new StudentComparable(171, "HOLMES", 43));
        b.add(new StudentComparable(172, "PALMER", 41));
        b.add(new StudentComparable(173, "WAGNER", 52));
        b.add(new StudentComparable(174, "BLACK", 65));
        b.add(new StudentComparable(175, "ROBERTSON", 98));
        b.add(new StudentComparable(176, "BOYD", 39));
        b.add(new StudentComparable(177, "ROSE", 50));
        b.add(new StudentComparable(178, "STONE", 55));
        b.add(new StudentComparable(179, "SALAZAR", 86));
        b.add(new StudentComparable(180, "FOX", 56));
        b.add(new StudentComparable(181, "WARREN", 35));
        b.add(new StudentComparable(182, "MILLS", 59));
        b.add(new StudentComparable(183, "MEYER", 43));
        b.add(new StudentComparable(184, "RICE", 67));
        b.add(new StudentComparable(185, "SCHMIDT", 36));
        b.add(new StudentComparable(186, "GARZA", 93));
        b.add(new StudentComparable(187, "DANIELS", 29));
        b.add(new StudentComparable(188, "FERGUSON", 93));
        b.add(new StudentComparable(189, "NICHOLS", 21));
        b.add(new StudentComparable(190, "STEPHENS", 53));
        b.add(new StudentComparable(191, "SOTO", 25));
        b.add(new StudentComparable(192, "WEAVER", 97));
        b.add(new StudentComparable(193, "RYAN", 51));
        b.add(new StudentComparable(194, "GARDNER", 74));
        b.add(new StudentComparable(195, "PAYNE", 71));
        b.add(new StudentComparable(196, "GRANT", 59));
        b.add(new StudentComparable(197, "DUNN", 78));
        b.add(new StudentComparable(198, "KELLEY", 86));
        b.add(new StudentComparable(199, "SPENCER", 23));
        b.add(new StudentComparable(200, "HAWKINS", 20));
        b.add(new StudentComparable(201, "ARNOLD", 75));
        b.add(new StudentComparable(202, "PIERCE", 98));
        b.add(new StudentComparable(203, "VAZQUEZ", 79));
        b.add(new StudentComparable(204, "HANSEN", 86));
        b.add(new StudentComparable(205, "PETERS", 89));
        b.add(new StudentComparable(206, "SANTOS", 58));
        b.add(new StudentComparable(207, "HART", 83));
        b.add(new StudentComparable(208, "BRADLEY", 38));
        b.add(new StudentComparable(209, "KNIGHT", 35));
        b.add(new StudentComparable(210, "ELLIOTT", 56));
        b.add(new StudentComparable(211, "CUNNINGHAM", 72));
        b.add(new StudentComparable(212, "DUNCAN", 87));
        b.add(new StudentComparable(213, "ARMSTRONG", 39));
        b.add(new StudentComparable(214, "HUDSON", 93));
        b.add(new StudentComparable(215, "CARROLL", 91));
        b.add(new StudentComparable(216, "LANE", 26));
        b.add(new StudentComparable(217, "RILEY", 45));
        b.add(new StudentComparable(218, "ANDREWS", 60));
        b.add(new StudentComparable(219, "ALVARADO", 60));
        b.add(new StudentComparable(220, "RAY", 27));
        b.add(new StudentComparable(221, "DELGADO", 46));
        b.add(new StudentComparable(222, "BERRY", 34));
        b.add(new StudentComparable(223, "PERKINS", 83));
        b.add(new StudentComparable(224, "HOFFMAN", 65));
        b.add(new StudentComparable(225, "JOHNSTON", 27));
        b.add(new StudentComparable(226, "MATTHEWS", 70));
        b.add(new StudentComparable(227, "PEÑA", 59));
        b.add(new StudentComparable(228, "RICHARDS", 86));
        b.add(new StudentComparable(229, "CONTRERAS", 62));
        b.add(new StudentComparable(230, "WILLIS", 67));
        b.add(new StudentComparable(231, "CARPENTER", 31));
        b.add(new StudentComparable(232, "LAWRENCE", 48));
        b.add(new StudentComparable(233, "SANDOVAL", 41));
        b.add(new StudentComparable(234, "GUERRERO", 22));
        b.add(new StudentComparable(235, "GEORGE", 59));
        b.add(new StudentComparable(236, "CHAPMAN", 22));
        b.add(new StudentComparable(237, "RIOS", 33));
        b.add(new StudentComparable(238, "ESTRADA", 32));
        b.add(new StudentComparable(239, "ORTEGA", 62));
        b.add(new StudentComparable(240, "WATKINS", 57));
        b.add(new StudentComparable(241, "GREENE", 70));
        b.add(new StudentComparable(242, "NUÑEZ", 91));
        b.add(new StudentComparable(243, "WHEELER", 32));
        b.add(new StudentComparable(244, "VALDEZ", 35));
        b.add(new StudentComparable(245, "HARPER", 25));
        b.add(new StudentComparable(246, "BURKE", 60));
        b.add(new StudentComparable(247, "LARSON", 99));
        b.add(new StudentComparable(248, "SANTIAGO", 58));
        b.add(new StudentComparable(249, "MALDONADO", 95));
        b.add(new StudentComparable(250, "MORRISON", 43));
        b.add(new StudentComparable(251, "FRANKLIN", 88));
        b.add(new StudentComparable(252, "CARLSON", 27));
        b.add(new StudentComparable(253, "AUSTIN", 92));
        b.add(new StudentComparable(254, "DOMINGUEZ", 76));
        b.add(new StudentComparable(255, "CARR", 43));
        b.add(new StudentComparable(256, "LAWSON", 65));
        b.add(new StudentComparable(257, "JACOBS", 56));
        b.add(new StudentComparable(258, "O’BRIEN", 20));
        b.add(new StudentComparable(259, "LYNCH", 86));
        b.add(new StudentComparable(260, "SINGH", 99));
        b.add(new StudentComparable(261, "VEGA", 46));
        b.add(new StudentComparable(262, "BISHOP", 66));
        b.add(new StudentComparable(263, "MONTGOMERY", 48));
        b.add(new StudentComparable(264, "OLIVER", 55));
        b.add(new StudentComparable(265, "JENSEN", 53));
        b.add(new StudentComparable(266, "HARVEY", 38));
        b.add(new StudentComparable(267, "WILLIAMSON", 30));
        b.add(new StudentComparable(268, "GILBERT", 55));
        b.add(new StudentComparable(269, "DEAN", 42));
        b.add(new StudentComparable(270, "SIMS", 20));
        b.add(new StudentComparable(271, "ESPINOZA", 72));
        b.add(new StudentComparable(272, "HOWELL", 42));
        b.add(new StudentComparable(273, "LI", 56));
        b.add(new StudentComparable(274, "WONG", 71));
        b.add(new StudentComparable(275, "REID", 74));
        b.add(new StudentComparable(276, "HANSON", 59));
        b.add(new StudentComparable(277, "LE", 67));
        b.add(new StudentComparable(278, "McCOY", 90));
        b.add(new StudentComparable(279, "GARRETT", 35));
        b.add(new StudentComparable(280, "BURTON", 24));
        b.add(new StudentComparable(281, "FULLER", 24));
        b.add(new StudentComparable(282, "WANG", 27));
        b.add(new StudentComparable(283, "WEBER", 49));
        b.add(new StudentComparable(284, "WELCH", 83));
        b.add(new StudentComparable(285, "ROJAS", 48));
        b.add(new StudentComparable(286, "LUCAS", 50));
        b.add(new StudentComparable(287, "MARQUEZ", 27));
        b.add(new StudentComparable(288, "FIELDS", 40));
        b.add(new StudentComparable(289, "PARK", 37));
        b.add(new StudentComparable(290, "YANG", 33));
        b.add(new StudentComparable(291, "LITTLE", 63));
        b.add(new StudentComparable(292, "BANKS", 73));
        b.add(new StudentComparable(293, "PADILLA", 35));
        b.add(new StudentComparable(294, "DAY", 84));
        b.add(new StudentComparable(295, "WALSH", 22));
        b.add(new StudentComparable(296, "BOWMAN", 35));
        b.add(new StudentComparable(297, "SCHULTZ", 40));
        b.add(new StudentComparable(298, "LUNA", 57));
        b.add(new StudentComparable(299, "FOWLER", 93));
        b.add(new StudentComparable(300, "MEJIA", 93));

    }

}
