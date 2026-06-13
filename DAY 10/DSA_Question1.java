public class DSA_Question1
{
    public static void main(String args[])
    {
            int height[] = {4, 2, 0, 6, 3, 2, 5};
            System.out.println(TrappedRainWater(height));
    }

    public static int TrappedRainWater(int height[])
    {
        int n = height.length; 
        // Calculate Left Max Boundary/Bar - array
        int LeftMax[] = new int[n];
        LeftMax[0] = height[0];
        for(int i = 1; i<n; i++)
        {
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]);
        }

        // Calculate Right Max Boundary/Bar - array
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--)
        {
            RightMax[i] = Math.max(height[i], RightMax[i+1]);
        }

        int trappedwater = 0;
        // Loop
        for(int i = 0; i<n; i++)
        {
            // Water Level = min(Left Max Boundary, Right Max Boundary)
            int WaterLevel = Math.min(LeftMax[i], RightMax[i]);

            // Trapped Water = Water Level - height
            trappedwater += WaterLevel - height[i];
        }
        return trappedwater;
    }
}