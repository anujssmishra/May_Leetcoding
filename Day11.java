class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int orgColor = image[sr][sc];
        
        if(sr>=image.length || sc>=image[0].length)
            return image;
        
        floodFill1(image, sr, sc, newColor, orgColor);
        return image;
    }
    
    public static void floodFill1(int[][] image, int sr, int sc, int newColor, int orgColor) {
        if(sr>=image.length || sr<0 || sc>=image[0].length || sc<0)
            return;
        
        if(image[sr][sc]==newColor)
            return;
        
        if(image[sr][sc]==orgColor) {
            image[sr][sc] = newColor;
        
            floodFill1(image, sr+1, sc, newColor, orgColor);
            floodFill1(image, sr, sc+1, newColor, orgColor);
            floodFill1(image, sr-1, sc, newColor, orgColor);
            floodFill1(image, sr, sc-1, newColor, orgColor);
        }
    }
}
