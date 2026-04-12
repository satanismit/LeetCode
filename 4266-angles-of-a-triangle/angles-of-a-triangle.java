class Solution {

    public double[] internalAngles(int[] sides) {

        int a= sides[0];
        int b= sides[1];
        int c= sides[2];

        if(a+b > c && a+c > b && b+c >a){

            // Math.toDegress --> convert radians to degree
            // Math.acos --> cosine inverse
            double angle_a =Math.toDegrees(Math.acos( (b*b + c*c - a*a)/ (2.0*b*c) ));
            double angle_b = Math.toDegrees(Math.acos( (a*a + c*c - b*b)/(2.0*a*c)));
            double angle_c = 180 - (angle_a + angle_b);

            double[] ans = {angle_a, angle_b, angle_c};
            Arrays.sort(ans);

            return ans;
            
        }

        return new double[]{};
        
        
    }
}