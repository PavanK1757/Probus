class BuildingRunner {
    public static void main(String[] args) {
        String[] names = {"Empire State", "Burj Khalifa", "Petronas", "One World Trade"};
        String[] buildings = Building.buildingName(names);
        for (int name = 0; name < buildings.length; name++) {
            System.out.println(buildings[name]);
        }

        int[] floors = {102, 163, 88, 104};
        int[] buildingFloors = Building.buildingFloors(floors);
        for (int floor = 0; floor < buildingFloors.length; floor++) {
            System.out.println(buildingFloors[floor]);
        }

        double[] height = {381.0, 828.0, 452.0, 541.0};
        double[] buildingHeights = Building.buildingHeight(height);
        for (int heights = 0; heights < buildingHeights.length; heights++) {
            System.out.println(buildingHeights[heights]);
        }

        float[] area = {208000.0f, 309473.0f, 395000.0f, 325000.0f};
        float[] buildingAreas = Building.buildingArea(area);
        for (int areas = 0; areas < buildingAreas.length; areas++) {
            System.out.println(buildingAreas[areas]);
        }

        boolean[] type = {true, true, false, true};
        boolean[] buildingType = Building.buildingIsCommercial(type);
        for (int types = 0; types < buildingType.length; types++) {
            System.out.println(buildingType[types]);
        }

        char[] symbol = {'B', 'U', 'I', 'L', 'D'};
        char[] buildingSymbols = Building.buildingSymbol(symbol);
        for (int symbols = 0; symbols < buildingSymbols.length; symbols++) {
            System.out.println(buildingSymbols[symbols]);
        }

        long[] number = {1001, 2002, 3003, 4004};
        long[] buildingNumbers = Building.buildingNumber(number);
        for (int num = 0; num < buildingNumbers.length; num++) {
            System.out.println(buildingNumbers[num]);
        }
    }
}
