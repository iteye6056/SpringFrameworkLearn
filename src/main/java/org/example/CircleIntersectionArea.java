package org.example;

public class CircleIntersectionArea {

    // 判断两个圆是否相交
    public static boolean isIntersect(Circle c1, Circle c2) {
        double distance = Math.sqrt(Math.pow(c1.centerX - c2.centerX, 2) + Math.pow(c1.centerY - c2.centerY, 2));
        return distance <= c1.radius + c2.radius;
    }

    // 计算两个圆交集的面积
    public static double intersectionArea(Circle c1, Circle c2) {
        if (!isIntersect(c1, c2)) {
            return 0;
        }

        double distance = Math.sqrt(Math.pow(c1.centerX - c2.centerX, 2) + Math.pow(c1.centerY - c2.centerY, 2));
        double radiusSum = c1.radius + c2.radius;
        double radiusSub = Math.abs(c1.radius - c2.radius);

        // 使用半径差、半径和、半径差计算交集面积
        if (distance > radiusSum) {
            // 外圆相交
            return Math.PI * Math.pow(radiusSum, 2) - Math.PI * Math.pow(radiusSub, 2);
        } else if (distance < radiusSub) {
            // 内圆相交
            return Math.PI * Math.pow(radiusSub, 2) - Math.PI * Math.pow(distance, 2);
        } else {
            // 外圆和内圆相交
            double angle1 = Math.acos((radiusSum + distance) / (2 * radiusSum));
            double angle2 = Math.acos((radiusSum - distance) / (2 * radiusSum));
            return radiusSum * radiusSum * (angle1 - sin(angle1)) + radiusSub * radiusSub * (angle2 - sin(angle2));
        }
    }

    // 计算正弦值
    private static double sin(double angle) {
        return Math.sin(angle) * (180 / Math.PI);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(0.0, 0.0, 2.0); // 圆1：中心点(1,0)，半径5
        Circle c2 = new Circle(3.0, 0.0, 2.0); // 圆2：中心点(0,0)，半径3

        double area = intersectionArea(c1, c2);
        System.out.println("两个圆交集的面积为: " + area);
    }
}

// 定义圆类
class Circle {
    double centerX;
    double centerY;
    double radius;

    Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
}
