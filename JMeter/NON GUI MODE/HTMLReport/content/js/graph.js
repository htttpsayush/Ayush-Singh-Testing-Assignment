/*
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
$(document).ready(function() {

    $(".click-title").mouseenter( function(    e){
        e.preventDefault();
        this.style.cursor="pointer";
    });
    $(".click-title").mousedown( function(event){
        event.preventDefault();
    });

    // Ugly code while this script is shared among several pages
    try{
        refreshHitsPerSecond(true);
    } catch(e){}
    try{
        refreshResponseTimeOverTime(true);
    } catch(e){}
    try{
        refreshResponseTimePercentiles();
    } catch(e){}
});


var responseTimePercentilesInfos = {
        data: {"result": {"minY": 48.0, "minX": 0.0, "maxY": 6945.0, "series": [{"data": [[0.0, 48.0], [0.1, 48.0], [0.2, 49.0], [0.3, 49.0], [0.4, 54.0], [0.5, 54.0], [0.6, 54.0], [0.7, 58.0], [0.8, 58.0], [0.9, 58.0], [1.0, 60.0], [1.1, 60.0], [1.2, 62.0], [1.3, 62.0], [1.4, 63.0], [1.5, 63.0], [1.6, 65.0], [1.7, 65.0], [1.8, 67.0], [1.9, 67.0], [2.0, 68.0], [2.1, 68.0], [2.2, 70.0], [2.3, 70.0], [2.4, 74.0], [2.5, 74.0], [2.6, 76.0], [2.7, 76.0], [2.8, 76.0], [2.9, 78.0], [3.0, 78.0], [3.1, 80.0], [3.2, 80.0], [3.3, 81.0], [3.4, 81.0], [3.5, 82.0], [3.6, 82.0], [3.7, 83.0], [3.8, 83.0], [3.9, 85.0], [4.0, 85.0], [4.1, 86.0], [4.2, 86.0], [4.3, 86.0], [4.4, 86.0], [4.5, 87.0], [4.6, 87.0], [4.7, 89.0], [4.8, 89.0], [4.9, 90.0], [5.0, 90.0], [5.1, 90.0], [5.2, 90.0], [5.3, 92.0], [5.4, 92.0], [5.5, 94.0], [5.6, 94.0], [5.7, 95.0], [5.8, 95.0], [5.9, 97.0], [6.0, 97.0], [6.1, 99.0], [6.2, 99.0], [6.3, 100.0], [6.4, 100.0], [6.5, 100.0], [6.6, 100.0], [6.7, 101.0], [6.8, 101.0], [6.9, 106.0], [7.0, 106.0], [7.1, 108.0], [7.2, 108.0], [7.3, 110.0], [7.4, 110.0], [7.5, 116.0], [7.6, 116.0], [7.7, 117.0], [7.8, 117.0], [7.9, 118.0], [8.0, 118.0], [8.1, 118.0], [8.2, 118.0], [8.3, 121.0], [8.4, 121.0], [8.5, 121.0], [8.6, 121.0], [8.7, 122.0], [8.8, 122.0], [8.9, 125.0], [9.0, 125.0], [9.1, 130.0], [9.2, 130.0], [9.3, 132.0], [9.4, 132.0], [9.5, 134.0], [9.6, 134.0], [9.7, 134.0], [9.8, 134.0], [9.9, 134.0], [10.0, 134.0], [10.1, 134.0], [10.2, 134.0], [10.3, 136.0], [10.4, 136.0], [10.5, 138.0], [10.6, 138.0], [10.7, 139.0], [10.8, 143.0], [10.9, 143.0], [11.0, 144.0], [11.1, 144.0], [11.2, 153.0], [11.3, 153.0], [11.4, 155.0], [11.5, 155.0], [11.6, 156.0], [11.7, 156.0], [11.8, 158.0], [11.9, 158.0], [12.0, 163.0], [12.1, 163.0], [12.2, 163.0], [12.3, 163.0], [12.4, 165.0], [12.5, 165.0], [12.6, 166.0], [12.7, 166.0], [12.8, 170.0], [12.9, 170.0], [13.0, 175.0], [13.1, 175.0], [13.2, 178.0], [13.3, 178.0], [13.4, 188.0], [13.5, 188.0], [13.6, 194.0], [13.7, 194.0], [13.8, 198.0], [13.9, 198.0], [14.0, 201.0], [14.1, 201.0], [14.2, 201.0], [14.3, 201.0], [14.4, 210.0], [14.5, 210.0], [14.6, 211.0], [14.7, 211.0], [14.8, 212.0], [14.9, 212.0], [15.0, 212.0], [15.1, 212.0], [15.2, 214.0], [15.3, 214.0], [15.4, 215.0], [15.5, 215.0], [15.6, 216.0], [15.7, 216.0], [15.8, 223.0], [15.9, 223.0], [16.0, 224.0], [16.1, 224.0], [16.2, 226.0], [16.3, 226.0], [16.4, 227.0], [16.5, 227.0], [16.6, 229.0], [16.7, 229.0], [16.8, 229.0], [16.9, 229.0], [17.0, 231.0], [17.1, 231.0], [17.2, 232.0], [17.3, 232.0], [17.4, 238.0], [17.5, 238.0], [17.6, 239.0], [17.7, 239.0], [17.8, 242.0], [17.9, 242.0], [18.0, 243.0], [18.1, 243.0], [18.2, 243.0], [18.3, 243.0], [18.4, 246.0], [18.5, 246.0], [18.6, 246.0], [18.7, 246.0], [18.8, 249.0], [18.9, 249.0], [19.0, 250.0], [19.1, 250.0], [19.2, 250.0], [19.3, 250.0], [19.4, 251.0], [19.5, 251.0], [19.6, 255.0], [19.7, 255.0], [19.8, 258.0], [19.9, 258.0], [20.0, 258.0], [20.1, 258.0], [20.2, 258.0], [20.3, 258.0], [20.4, 260.0], [20.5, 260.0], [20.6, 260.0], [20.7, 260.0], [20.8, 260.0], [20.9, 260.0], [21.0, 261.0], [21.1, 261.0], [21.2, 263.0], [21.3, 263.0], [21.4, 263.0], [21.5, 263.0], [21.6, 263.0], [21.7, 263.0], [21.8, 263.0], [21.9, 263.0], [22.0, 264.0], [22.1, 264.0], [22.2, 268.0], [22.3, 268.0], [22.4, 270.0], [22.5, 270.0], [22.6, 271.0], [22.7, 271.0], [22.8, 272.0], [22.9, 272.0], [23.0, 272.0], [23.1, 272.0], [23.2, 274.0], [23.3, 274.0], [23.4, 274.0], [23.5, 274.0], [23.6, 274.0], [23.7, 274.0], [23.8, 275.0], [23.9, 275.0], [24.0, 275.0], [24.1, 275.0], [24.2, 276.0], [24.3, 276.0], [24.4, 278.0], [24.5, 278.0], [24.6, 278.0], [24.7, 278.0], [24.8, 279.0], [24.9, 279.0], [25.0, 282.0], [25.1, 282.0], [25.2, 283.0], [25.3, 283.0], [25.4, 285.0], [25.5, 285.0], [25.6, 289.0], [25.7, 289.0], [25.8, 289.0], [25.9, 289.0], [26.0, 292.0], [26.1, 292.0], [26.2, 295.0], [26.3, 295.0], [26.4, 297.0], [26.5, 297.0], [26.6, 300.0], [26.7, 300.0], [26.8, 303.0], [26.9, 303.0], [27.0, 303.0], [27.1, 303.0], [27.2, 307.0], [27.3, 307.0], [27.4, 309.0], [27.5, 309.0], [27.6, 309.0], [27.7, 309.0], [27.8, 313.0], [27.9, 313.0], [28.0, 314.0], [28.1, 314.0], [28.2, 315.0], [28.3, 315.0], [28.4, 321.0], [28.5, 321.0], [28.6, 321.0], [28.7, 321.0], [28.8, 322.0], [28.9, 322.0], [29.0, 333.0], [29.1, 333.0], [29.2, 334.0], [29.3, 334.0], [29.4, 335.0], [29.5, 335.0], [29.6, 338.0], [29.7, 338.0], [29.8, 340.0], [29.9, 340.0], [30.0, 340.0], [30.1, 340.0], [30.2, 341.0], [30.3, 341.0], [30.4, 342.0], [30.5, 342.0], [30.6, 345.0], [30.7, 345.0], [30.8, 347.0], [30.9, 347.0], [31.0, 352.0], [31.1, 352.0], [31.2, 353.0], [31.3, 353.0], [31.4, 357.0], [31.5, 357.0], [31.6, 358.0], [31.7, 358.0], [31.8, 358.0], [31.9, 358.0], [32.0, 359.0], [32.1, 359.0], [32.2, 368.0], [32.3, 368.0], [32.4, 370.0], [32.5, 370.0], [32.6, 372.0], [32.7, 372.0], [32.8, 374.0], [32.9, 374.0], [33.0, 380.0], [33.1, 380.0], [33.2, 385.0], [33.3, 385.0], [33.4, 386.0], [33.5, 386.0], [33.6, 386.0], [33.7, 386.0], [33.8, 388.0], [33.9, 388.0], [34.0, 390.0], [34.1, 390.0], [34.2, 391.0], [34.3, 391.0], [34.4, 392.0], [34.5, 392.0], [34.6, 394.0], [34.7, 394.0], [34.8, 397.0], [34.9, 397.0], [35.0, 400.0], [35.1, 400.0], [35.2, 401.0], [35.3, 401.0], [35.4, 401.0], [35.5, 401.0], [35.6, 402.0], [35.7, 402.0], [35.8, 403.0], [35.9, 403.0], [36.0, 408.0], [36.1, 408.0], [36.2, 410.0], [36.3, 410.0], [36.4, 411.0], [36.5, 411.0], [36.6, 411.0], [36.7, 411.0], [36.8, 413.0], [36.9, 413.0], [37.0, 413.0], [37.1, 413.0], [37.2, 413.0], [37.3, 413.0], [37.4, 414.0], [37.5, 414.0], [37.6, 415.0], [37.7, 415.0], [37.8, 417.0], [37.9, 417.0], [38.0, 417.0], [38.1, 417.0], [38.2, 418.0], [38.3, 418.0], [38.4, 418.0], [38.5, 418.0], [38.6, 419.0], [38.7, 419.0], [38.8, 420.0], [38.9, 420.0], [39.0, 420.0], [39.1, 420.0], [39.2, 423.0], [39.3, 423.0], [39.4, 423.0], [39.5, 423.0], [39.6, 425.0], [39.7, 425.0], [39.8, 428.0], [39.9, 428.0], [40.0, 431.0], [40.1, 431.0], [40.2, 432.0], [40.3, 432.0], [40.4, 432.0], [40.5, 433.0], [40.6, 433.0], [40.7, 435.0], [40.8, 435.0], [40.9, 436.0], [41.0, 436.0], [41.1, 436.0], [41.2, 436.0], [41.3, 437.0], [41.4, 437.0], [41.5, 438.0], [41.6, 438.0], [41.7, 441.0], [41.8, 441.0], [41.9, 442.0], [42.0, 442.0], [42.1, 446.0], [42.2, 446.0], [42.3, 447.0], [42.4, 447.0], [42.5, 448.0], [42.6, 448.0], [42.7, 451.0], [42.8, 451.0], [42.9, 459.0], [43.0, 459.0], [43.1, 463.0], [43.2, 463.0], [43.3, 464.0], [43.4, 464.0], [43.5, 466.0], [43.6, 466.0], [43.7, 470.0], [43.8, 470.0], [43.9, 470.0], [44.0, 470.0], [44.1, 472.0], [44.2, 472.0], [44.3, 473.0], [44.4, 473.0], [44.5, 476.0], [44.6, 476.0], [44.7, 478.0], [44.8, 478.0], [44.9, 478.0], [45.0, 478.0], [45.1, 479.0], [45.2, 479.0], [45.3, 480.0], [45.4, 480.0], [45.5, 483.0], [45.6, 483.0], [45.7, 486.0], [45.8, 486.0], [45.9, 491.0], [46.0, 491.0], [46.1, 491.0], [46.2, 491.0], [46.3, 502.0], [46.4, 502.0], [46.5, 513.0], [46.6, 513.0], [46.7, 514.0], [46.8, 514.0], [46.9, 515.0], [47.0, 515.0], [47.1, 516.0], [47.2, 516.0], [47.3, 520.0], [47.4, 520.0], [47.5, 523.0], [47.6, 523.0], [47.7, 526.0], [47.8, 526.0], [47.9, 529.0], [48.0, 529.0], [48.1, 530.0], [48.2, 530.0], [48.3, 534.0], [48.4, 534.0], [48.5, 539.0], [48.6, 539.0], [48.7, 539.0], [48.8, 539.0], [48.9, 541.0], [49.0, 541.0], [49.1, 545.0], [49.2, 545.0], [49.3, 557.0], [49.4, 557.0], [49.5, 559.0], [49.6, 559.0], [49.7, 560.0], [49.8, 560.0], [49.9, 561.0], [50.0, 561.0], [50.1, 564.0], [50.2, 564.0], [50.3, 567.0], [50.4, 567.0], [50.5, 569.0], [50.6, 569.0], [50.7, 571.0], [50.8, 571.0], [50.9, 573.0], [51.0, 573.0], [51.1, 577.0], [51.2, 577.0], [51.3, 578.0], [51.4, 578.0], [51.5, 579.0], [51.6, 579.0], [51.7, 581.0], [51.8, 581.0], [51.9, 584.0], [52.0, 584.0], [52.1, 588.0], [52.2, 588.0], [52.3, 591.0], [52.4, 591.0], [52.5, 592.0], [52.6, 592.0], [52.7, 599.0], [52.8, 599.0], [52.9, 601.0], [53.0, 601.0], [53.1, 601.0], [53.2, 601.0], [53.3, 602.0], [53.4, 602.0], [53.5, 607.0], [53.6, 607.0], [53.7, 609.0], [53.8, 609.0], [53.9, 609.0], [54.0, 609.0], [54.1, 611.0], [54.2, 611.0], [54.3, 611.0], [54.4, 611.0], [54.5, 613.0], [54.6, 613.0], [54.7, 619.0], [54.8, 619.0], [54.9, 619.0], [55.0, 619.0], [55.1, 621.0], [55.2, 621.0], [55.3, 621.0], [55.4, 621.0], [55.5, 623.0], [55.6, 623.0], [55.7, 625.0], [55.8, 625.0], [55.9, 626.0], [56.0, 626.0], [56.1, 627.0], [56.2, 627.0], [56.3, 639.0], [56.4, 639.0], [56.5, 648.0], [56.6, 648.0], [56.7, 649.0], [56.8, 649.0], [56.9, 656.0], [57.0, 656.0], [57.1, 656.0], [57.2, 656.0], [57.3, 658.0], [57.4, 658.0], [57.5, 658.0], [57.6, 658.0], [57.7, 662.0], [57.8, 662.0], [57.9, 663.0], [58.0, 663.0], [58.1, 668.0], [58.2, 668.0], [58.3, 672.0], [58.4, 672.0], [58.5, 673.0], [58.6, 673.0], [58.7, 676.0], [58.8, 676.0], [58.9, 677.0], [59.0, 677.0], [59.1, 678.0], [59.2, 678.0], [59.3, 678.0], [59.4, 678.0], [59.5, 681.0], [59.6, 681.0], [59.7, 683.0], [59.8, 683.0], [59.9, 684.0], [60.0, 684.0], [60.1, 684.0], [60.2, 684.0], [60.3, 688.0], [60.4, 688.0], [60.5, 689.0], [60.6, 689.0], [60.7, 691.0], [60.8, 691.0], [60.9, 691.0], [61.0, 691.0], [61.1, 692.0], [61.2, 692.0], [61.3, 693.0], [61.4, 693.0], [61.5, 703.0], [61.6, 703.0], [61.7, 705.0], [61.8, 705.0], [61.9, 709.0], [62.0, 709.0], [62.1, 710.0], [62.2, 710.0], [62.3, 712.0], [62.4, 712.0], [62.5, 714.0], [62.6, 714.0], [62.7, 719.0], [62.8, 719.0], [62.9, 720.0], [63.0, 720.0], [63.1, 731.0], [63.2, 731.0], [63.3, 734.0], [63.4, 734.0], [63.5, 741.0], [63.6, 741.0], [63.7, 742.0], [63.8, 742.0], [63.9, 742.0], [64.0, 742.0], [64.1, 747.0], [64.2, 747.0], [64.3, 748.0], [64.4, 748.0], [64.5, 750.0], [64.6, 750.0], [64.7, 754.0], [64.8, 754.0], [64.9, 755.0], [65.0, 755.0], [65.1, 760.0], [65.2, 760.0], [65.3, 761.0], [65.4, 761.0], [65.5, 764.0], [65.6, 764.0], [65.7, 767.0], [65.8, 767.0], [65.9, 769.0], [66.0, 769.0], [66.1, 772.0], [66.2, 772.0], [66.3, 773.0], [66.4, 773.0], [66.5, 778.0], [66.6, 778.0], [66.7, 780.0], [66.8, 780.0], [66.9, 782.0], [67.0, 782.0], [67.1, 784.0], [67.2, 784.0], [67.3, 793.0], [67.4, 793.0], [67.5, 798.0], [67.6, 798.0], [67.7, 808.0], [67.8, 808.0], [67.9, 815.0], [68.0, 815.0], [68.1, 826.0], [68.2, 826.0], [68.3, 829.0], [68.4, 829.0], [68.5, 833.0], [68.6, 833.0], [68.7, 834.0], [68.8, 834.0], [68.9, 835.0], [69.0, 835.0], [69.1, 852.0], [69.2, 852.0], [69.3, 856.0], [69.4, 856.0], [69.5, 867.0], [69.6, 867.0], [69.7, 871.0], [69.8, 871.0], [69.9, 872.0], [70.0, 872.0], [70.1, 874.0], [70.2, 874.0], [70.3, 881.0], [70.4, 881.0], [70.5, 882.0], [70.6, 882.0], [70.7, 887.0], [70.8, 887.0], [70.9, 890.0], [71.0, 890.0], [71.1, 910.0], [71.2, 910.0], [71.3, 912.0], [71.4, 912.0], [71.5, 918.0], [71.6, 918.0], [71.7, 929.0], [71.8, 929.0], [71.9, 934.0], [72.0, 934.0], [72.1, 936.0], [72.2, 936.0], [72.3, 941.0], [72.4, 941.0], [72.5, 951.0], [72.6, 951.0], [72.7, 958.0], [72.8, 958.0], [72.9, 958.0], [73.0, 958.0], [73.1, 959.0], [73.2, 959.0], [73.3, 960.0], [73.4, 960.0], [73.5, 965.0], [73.6, 965.0], [73.7, 966.0], [73.8, 966.0], [73.9, 967.0], [74.0, 967.0], [74.1, 977.0], [74.2, 977.0], [74.3, 982.0], [74.4, 982.0], [74.5, 983.0], [74.6, 983.0], [74.7, 983.0], [74.8, 983.0], [74.9, 985.0], [75.0, 985.0], [75.1, 988.0], [75.2, 988.0], [75.3, 996.0], [75.4, 996.0], [75.5, 998.0], [75.6, 998.0], [75.7, 1000.0], [75.8, 1000.0], [75.9, 1001.0], [76.0, 1001.0], [76.1, 1001.0], [76.2, 1001.0], [76.3, 1002.0], [76.4, 1002.0], [76.5, 1005.0], [76.6, 1005.0], [76.7, 1008.0], [76.8, 1008.0], [76.9, 1014.0], [77.0, 1014.0], [77.1, 1018.0], [77.2, 1018.0], [77.3, 1019.0], [77.4, 1019.0], [77.5, 1032.0], [77.6, 1032.0], [77.7, 1034.0], [77.8, 1034.0], [77.9, 1036.0], [78.0, 1036.0], [78.1, 1041.0], [78.2, 1041.0], [78.3, 1041.0], [78.4, 1041.0], [78.5, 1044.0], [78.6, 1044.0], [78.7, 1045.0], [78.8, 1045.0], [78.9, 1052.0], [79.0, 1052.0], [79.1, 1059.0], [79.2, 1059.0], [79.3, 1063.0], [79.4, 1063.0], [79.5, 1065.0], [79.6, 1065.0], [79.7, 1074.0], [79.8, 1074.0], [79.9, 1074.0], [80.0, 1074.0], [80.1, 1076.0], [80.2, 1076.0], [80.3, 1081.0], [80.4, 1081.0], [80.5, 1092.0], [80.6, 1092.0], [80.7, 1096.0], [80.8, 1096.0], [80.9, 1101.0], [81.0, 1101.0], [81.1, 1104.0], [81.2, 1104.0], [81.3, 1106.0], [81.4, 1106.0], [81.5, 1107.0], [81.6, 1107.0], [81.7, 1125.0], [81.8, 1125.0], [81.9, 1132.0], [82.0, 1132.0], [82.1, 1135.0], [82.2, 1135.0], [82.3, 1160.0], [82.4, 1160.0], [82.5, 1173.0], [82.6, 1173.0], [82.7, 1185.0], [82.8, 1185.0], [82.9, 1191.0], [83.0, 1191.0], [83.1, 1242.0], [83.2, 1242.0], [83.3, 1259.0], [83.4, 1259.0], [83.5, 1264.0], [83.6, 1264.0], [83.7, 1273.0], [83.8, 1273.0], [83.9, 1281.0], [84.0, 1281.0], [84.1, 1282.0], [84.2, 1282.0], [84.3, 1293.0], [84.4, 1293.0], [84.5, 1294.0], [84.6, 1294.0], [84.7, 1325.0], [84.8, 1325.0], [84.9, 1331.0], [85.0, 1331.0], [85.1, 1332.0], [85.2, 1332.0], [85.3, 1340.0], [85.4, 1340.0], [85.5, 1380.0], [85.6, 1380.0], [85.7, 1386.0], [85.8, 1386.0], [85.9, 1386.0], [86.0, 1386.0], [86.1, 1404.0], [86.2, 1404.0], [86.3, 1425.0], [86.4, 1425.0], [86.5, 1431.0], [86.6, 1431.0], [86.7, 1444.0], [86.8, 1444.0], [86.9, 1453.0], [87.0, 1453.0], [87.1, 1457.0], [87.2, 1457.0], [87.3, 1458.0], [87.4, 1458.0], [87.5, 1472.0], [87.6, 1472.0], [87.7, 1504.0], [87.8, 1504.0], [87.9, 1513.0], [88.0, 1513.0], [88.1, 1513.0], [88.2, 1513.0], [88.3, 1518.0], [88.4, 1518.0], [88.5, 1520.0], [88.6, 1520.0], [88.7, 1526.0], [88.8, 1526.0], [88.9, 1527.0], [89.0, 1527.0], [89.1, 1529.0], [89.2, 1529.0], [89.3, 1542.0], [89.4, 1542.0], [89.5, 1558.0], [89.6, 1558.0], [89.7, 1594.0], [89.8, 1594.0], [89.9, 1611.0], [90.0, 1611.0], [90.1, 1626.0], [90.2, 1626.0], [90.3, 1635.0], [90.4, 1635.0], [90.5, 1645.0], [90.6, 1645.0], [90.7, 1646.0], [90.8, 1646.0], [90.9, 1666.0], [91.0, 1666.0], [91.1, 1668.0], [91.2, 1668.0], [91.3, 1687.0], [91.4, 1687.0], [91.5, 1692.0], [91.6, 1692.0], [91.7, 1698.0], [91.8, 1698.0], [91.9, 1703.0], [92.0, 1703.0], [92.1, 1722.0], [92.2, 1722.0], [92.3, 1738.0], [92.4, 1738.0], [92.5, 1757.0], [92.6, 1757.0], [92.7, 1790.0], [92.8, 1790.0], [92.9, 1863.0], [93.0, 1863.0], [93.1, 1863.0], [93.2, 1863.0], [93.3, 1867.0], [93.4, 1867.0], [93.5, 1890.0], [93.6, 1890.0], [93.7, 1926.0], [93.8, 1926.0], [93.9, 1976.0], [94.0, 1976.0], [94.1, 2001.0], [94.2, 2001.0], [94.3, 2015.0], [94.4, 2015.0], [94.5, 2065.0], [94.6, 2065.0], [94.7, 2075.0], [94.8, 2075.0], [94.9, 2140.0], [95.0, 2140.0], [95.1, 2146.0], [95.2, 2146.0], [95.3, 2155.0], [95.4, 2155.0], [95.5, 2183.0], [95.6, 2183.0], [95.7, 2299.0], [95.8, 2299.0], [95.9, 2406.0], [96.0, 2406.0], [96.1, 2495.0], [96.2, 2495.0], [96.3, 2506.0], [96.4, 2506.0], [96.5, 2532.0], [96.6, 2532.0], [96.7, 2648.0], [96.8, 2648.0], [96.9, 2922.0], [97.0, 2922.0], [97.1, 3010.0], [97.2, 3010.0], [97.3, 3209.0], [97.4, 3209.0], [97.5, 3550.0], [97.6, 3550.0], [97.7, 3586.0], [97.8, 3586.0], [97.9, 4520.0], [98.0, 4520.0], [98.1, 4528.0], [98.2, 4528.0], [98.3, 4765.0], [98.4, 4765.0], [98.5, 4787.0], [98.6, 4787.0], [98.7, 5041.0], [98.8, 5041.0], [98.9, 5085.0], [99.0, 5085.0], [99.1, 5146.0], [99.2, 5146.0], [99.3, 5366.0], [99.4, 5366.0], [99.5, 5420.0], [99.6, 5420.0], [99.7, 6387.0], [99.8, 6387.0], [99.9, 6945.0], [100.0, 6945.0]], "isOverall": false, "label": "HTTP Request", "isController": false}], "supportsControllersDiscrimination": true, "maxX": 100.0, "title": "Response Time Percentiles"}},
        getOptions: function() {
            return {
                series: {
                    points: { show: false }
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: '#legendResponseTimePercentiles'
                },
                xaxis: {
                    tickDecimals: 1,
                    axisLabel: "Percentiles",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Percentile value in ms",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s : %x.2 percentile was %y ms"
                },
                selection: { mode: "xy" },
            };
        },
        createGraph: function() {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesResponseTimePercentiles"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotResponseTimesPercentiles"), dataset, options);
            // setup overview
            $.plot($("#overviewResponseTimesPercentiles"), dataset, prepareOverviewOptions(options));
        }
};

/**
 * @param elementId Id of element where we display message
 */
function setEmptyGraph(elementId) {
    $(function() {
        $(elementId).text("No graph series with filter="+seriesFilter);
    });
}

// Response times percentiles
function refreshResponseTimePercentiles() {
    var infos = responseTimePercentilesInfos;
    prepareSeries(infos.data);
    if(infos.data.result.series.length == 0) {
        setEmptyGraph("#bodyResponseTimePercentiles");
        return;
    }
    if (isGraph($("#flotResponseTimesPercentiles"))){
        infos.createGraph();
    } else {
        var choiceContainer = $("#choicesResponseTimePercentiles");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotResponseTimesPercentiles", "#overviewResponseTimesPercentiles");
        $('#bodyResponseTimePercentiles .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
}

var responseTimeDistributionInfos = {
        data: {"result": {"minY": 1.0, "minX": 0.0, "maxY": 63.0, "series": [{"data": [[0.0, 31.0], [600.0, 43.0], [700.0, 31.0], [800.0, 17.0], [900.0, 23.0], [1000.0, 26.0], [1100.0, 11.0], [1200.0, 8.0], [1300.0, 7.0], [1400.0, 8.0], [1500.0, 11.0], [1600.0, 10.0], [100.0, 39.0], [1700.0, 5.0], [1800.0, 4.0], [1900.0, 2.0], [2000.0, 4.0], [2100.0, 4.0], [2200.0, 1.0], [2400.0, 2.0], [2500.0, 2.0], [2600.0, 1.0], [2900.0, 1.0], [3000.0, 1.0], [200.0, 63.0], [3200.0, 1.0], [3500.0, 2.0], [4500.0, 2.0], [4700.0, 2.0], [300.0, 42.0], [5100.0, 1.0], [5000.0, 2.0], [5300.0, 1.0], [5400.0, 1.0], [6300.0, 1.0], [400.0, 56.0], [6900.0, 1.0], [500.0, 33.0]], "isOverall": false, "label": "HTTP Request", "isController": false}], "supportsControllersDiscrimination": true, "granularity": 100, "maxX": 6900.0, "title": "Response Time Distribution"}},
        getOptions: function() {
            var granularity = this.data.result.granularity;
            return {
                legend: {
                    noColumns: 2,
                    show: true,
                    container: '#legendResponseTimeDistribution'
                },
                xaxis:{
                    axisLabel: "Response times in ms",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Number of responses",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                bars : {
                    show: true,
                    barWidth: this.data.result.granularity
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: function(label, xval, yval, flotItem){
                        return yval + " responses for " + label + " were between " + xval + " and " + (xval + granularity) + " ms";
                    }
                }
            };
        },
        createGraph: function() {
            var data = this.data;
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotResponseTimeDistribution"), prepareData(data.result.series, $("#choicesResponseTimeDistribution")), options);
        }

};

// Response time distribution
function refreshResponseTimeDistribution() {
    var infos = responseTimeDistributionInfos;
    prepareSeries(infos.data);
    if(infos.data.result.series.length == 0) {
        setEmptyGraph("#bodyResponseTimeDistribution");
        return;
    }
    if (isGraph($("#flotResponseTimeDistribution"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesResponseTimeDistribution");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        $('#footerResponseTimeDistribution .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};


var syntheticResponseTimeDistributionInfos = {
        data: {"result": {"minY": 62.0, "minX": 0.0, "ticks": [[0, "Requests having \nresponse time <= 500ms"], [1, "Requests having \nresponse time > 500ms and <= 1,500ms"], [2, "Requests having \nresponse time > 1,500ms"], [3, "Requests in error"]], "maxY": 231.0, "series": [{"data": [[0.0, 231.0]], "color": "#9ACD32", "isOverall": false, "label": "Requests having \nresponse time <= 500ms", "isController": false}, {"data": [[1.0, 207.0]], "color": "yellow", "isOverall": false, "label": "Requests having \nresponse time > 500ms and <= 1,500ms", "isController": false}, {"data": [[2.0, 62.0]], "color": "orange", "isOverall": false, "label": "Requests having \nresponse time > 1,500ms", "isController": false}, {"data": [], "color": "#FF6347", "isOverall": false, "label": "Requests in error", "isController": false}], "supportsControllersDiscrimination": false, "maxX": 2.0, "title": "Synthetic Response Times Distribution"}},
        getOptions: function() {
            return {
                legend: {
                    noColumns: 2,
                    show: true,
                    container: '#legendSyntheticResponseTimeDistribution'
                },
                xaxis:{
                    axisLabel: "Response times ranges",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                    tickLength:0,
                    min:-0.5,
                    max:3.5
                },
                yaxis: {
                    axisLabel: "Number of responses",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                bars : {
                    show: true,
                    align: "center",
                    barWidth: 0.25,
                    fill:.75
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: function(label, xval, yval, flotItem){
                        return yval + " " + label;
                    }
                }
            };
        },
        createGraph: function() {
            var data = this.data;
            var options = this.getOptions();
            prepareOptions(options, data);
            options.xaxis.ticks = data.result.ticks;
            $.plot($("#flotSyntheticResponseTimeDistribution"), prepareData(data.result.series, $("#choicesSyntheticResponseTimeDistribution")), options);
        }

};

// Response time distribution
function refreshSyntheticResponseTimeDistribution() {
    var infos = syntheticResponseTimeDistributionInfos;
    prepareSeries(infos.data, true);
    if (isGraph($("#flotSyntheticResponseTimeDistribution"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesSyntheticResponseTimeDistribution");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        $('#footerSyntheticResponseTimeDistribution .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

var activeThreadsOverTimeInfos = {
        data: {"result": {"minY": 9.424000000000001, "minX": 1.78478358E12, "maxY": 9.424000000000001, "series": [{"data": [[1.78478358E12, 9.424000000000001]], "isOverall": false, "label": "NON GUI TestCases Using CSV Files", "isController": false}], "supportsControllersDiscrimination": false, "granularity": 60000, "maxX": 1.78478358E12, "title": "Active Threads Over Time"}},
        getOptions: function() {
            return {
                series: {
                    stack: true,
                    lines: {
                        show: true,
                        fill: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Number of active threads",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20
                },
                legend: {
                    noColumns: 6,
                    show: true,
                    container: '#legendActiveThreadsOverTime'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                selection: {
                    mode: 'xy'
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s : At %x there were %y active threads"
                }
            };
        },
        createGraph: function() {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesActiveThreadsOverTime"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotActiveThreadsOverTime"), dataset, options);
            // setup overview
            $.plot($("#overviewActiveThreadsOverTime"), dataset, prepareOverviewOptions(options));
        }
};

// Active Threads Over Time
function refreshActiveThreadsOverTime(fixTimestamps) {
    var infos = activeThreadsOverTimeInfos;
    prepareSeries(infos.data);
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotActiveThreadsOverTime"))) {
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesActiveThreadsOverTime");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotActiveThreadsOverTime", "#overviewActiveThreadsOverTime");
        $('#footerActiveThreadsOverTime .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

var timeVsThreadsInfos = {
        data: {"result": {"minY": 347.64285714285717, "minX": 1.0, "maxY": 918.0, "series": [{"data": [[8.0, 561.9], [4.0, 643.3333333333335], [2.0, 503.1666666666667], [1.0, 739.5], [9.0, 347.64285714285717], [10.0, 848.2718676122919], [5.0, 432.0], [6.0, 786.6666666666666], [3.0, 918.0], [7.0, 686.5]], "isOverall": false, "label": "HTTP Request", "isController": false}, {"data": [[9.424000000000001, 798.3860000000008]], "isOverall": false, "label": "HTTP Request-Aggregated", "isController": false}], "supportsControllersDiscrimination": true, "maxX": 10.0, "title": "Time VS Threads"}},
        getOptions: function() {
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    axisLabel: "Number of active threads",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Average response times in ms",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20
                },
                legend: { noColumns: 2,show: true, container: '#legendTimeVsThreads' },
                selection: {
                    mode: 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s: At %x.2 active threads, Average response time was %y.2 ms"
                }
            };
        },
        createGraph: function() {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesTimeVsThreads"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotTimesVsThreads"), dataset, options);
            // setup overview
            $.plot($("#overviewTimesVsThreads"), dataset, prepareOverviewOptions(options));
        }
};

// Time vs threads
function refreshTimeVsThreads(){
    var infos = timeVsThreadsInfos;
    prepareSeries(infos.data);
    if(infos.data.result.series.length == 0) {
        setEmptyGraph("#bodyTimeVsThreads");
        return;
    }
    if(isGraph($("#flotTimesVsThreads"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesTimeVsThreads");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotTimesVsThreads", "#overviewTimesVsThreads");
        $('#footerTimeVsThreads .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

var bytesThroughputOverTimeInfos = {
        data : {"result": {"minY": 1133.3333333333333, "minX": 1.78478358E12, "maxY": 891219.9333333333, "series": [{"data": [[1.78478358E12, 891219.9333333333]], "isOverall": false, "label": "Bytes received per second", "isController": false}, {"data": [[1.78478358E12, 1133.3333333333333]], "isOverall": false, "label": "Bytes sent per second", "isController": false}], "supportsControllersDiscrimination": false, "granularity": 60000, "maxX": 1.78478358E12, "title": "Bytes Throughput Over Time"}},
        getOptions : function(){
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity) ,
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Bytes / sec",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: '#legendBytesThroughputOverTime'
                },
                selection: {
                    mode: "xy"
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s at %x was %y"
                }
            };
        },
        createGraph : function() {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesBytesThroughputOverTime"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotBytesThroughputOverTime"), dataset, options);
            // setup overview
            $.plot($("#overviewBytesThroughputOverTime"), dataset, prepareOverviewOptions(options));
        }
};

// Bytes throughput Over Time
function refreshBytesThroughputOverTime(fixTimestamps) {
    var infos = bytesThroughputOverTimeInfos;
    prepareSeries(infos.data);
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotBytesThroughputOverTime"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesBytesThroughputOverTime");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotBytesThroughputOverTime", "#overviewBytesThroughputOverTime");
        $('#footerBytesThroughputOverTime .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
}

var responseTimesOverTimeInfos = {
        data: {"result": {"minY": 798.3860000000008, "minX": 1.78478358E12, "maxY": 798.3860000000008, "series": [{"data": [[1.78478358E12, 798.3860000000008]], "isOverall": false, "label": "HTTP Request", "isController": false}], "supportsControllersDiscrimination": true, "granularity": 60000, "maxX": 1.78478358E12, "title": "Response Time Over Time"}},
        getOptions: function(){
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Average response time in ms",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: '#legendResponseTimesOverTime'
                },
                selection: {
                    mode: 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s : at %x Average response time was %y ms"
                }
            };
        },
        createGraph: function() {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesResponseTimesOverTime"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotResponseTimesOverTime"), dataset, options);
            // setup overview
            $.plot($("#overviewResponseTimesOverTime"), dataset, prepareOverviewOptions(options));
        }
};

// Response Times Over Time
function refreshResponseTimeOverTime(fixTimestamps) {
    var infos = responseTimesOverTimeInfos;
    prepareSeries(infos.data);
    if(infos.data.result.series.length == 0) {
        setEmptyGraph("#bodyResponseTimeOverTime");
        return;
    }
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotResponseTimesOverTime"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesResponseTimesOverTime");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotResponseTimesOverTime", "#overviewResponseTimesOverTime");
        $('#footerResponseTimesOverTime .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

var latenciesOverTimeInfos = {
        data: {"result": {"minY": 624.9559999999998, "minX": 1.78478358E12, "maxY": 624.9559999999998, "series": [{"data": [[1.78478358E12, 624.9559999999998]], "isOverall": false, "label": "HTTP Request", "isController": false}], "supportsControllersDiscrimination": true, "granularity": 60000, "maxX": 1.78478358E12, "title": "Latencies Over Time"}},
        getOptions: function() {
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Average response latencies in ms",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: '#legendLatenciesOverTime'
                },
                selection: {
                    mode: 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s : at %x Average latency was %y ms"
                }
            };
        },
        createGraph: function () {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesLatenciesOverTime"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotLatenciesOverTime"), dataset, options);
            // setup overview
            $.plot($("#overviewLatenciesOverTime"), dataset, prepareOverviewOptions(options));
        }
};

// Latencies Over Time
function refreshLatenciesOverTime(fixTimestamps) {
    var infos = latenciesOverTimeInfos;
    prepareSeries(infos.data);
    if(infos.data.result.series.length == 0) {
        setEmptyGraph("#bodyLatenciesOverTime");
        return;
    }
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotLatenciesOverTime"))) {
        infos.createGraph();
    }else {
        var choiceContainer = $("#choicesLatenciesOverTime");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotLatenciesOverTime", "#overviewLatenciesOverTime");
        $('#footerLatenciesOverTime .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

var connectTimeOverTimeInfos = {
        data: {"result": {"minY": 136.878, "minX": 1.78478358E12, "maxY": 136.878, "series": [{"data": [[1.78478358E12, 136.878]], "isOverall": false, "label": "HTTP Request", "isController": false}], "supportsControllersDiscrimination": true, "granularity": 60000, "maxX": 1.78478358E12, "title": "Connect Time Over Time"}},
        getOptions: function() {
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getConnectTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Average Connect Time in ms",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: '#legendConnectTimeOverTime'
                },
                selection: {
                    mode: 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s : at %x Average connect time was %y ms"
                }
            };
        },
        createGraph: function () {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesConnectTimeOverTime"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotConnectTimeOverTime"), dataset, options);
            // setup overview
            $.plot($("#overviewConnectTimeOverTime"), dataset, prepareOverviewOptions(options));
        }
};

// Connect Time Over Time
function refreshConnectTimeOverTime(fixTimestamps) {
    var infos = connectTimeOverTimeInfos;
    prepareSeries(infos.data);
    if(infos.data.result.series.length == 0) {
        setEmptyGraph("#bodyConnectTimeOverTime");
        return;
    }
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotConnectTimeOverTime"))) {
        infos.createGraph();
    }else {
        var choiceContainer = $("#choicesConnectTimeOverTime");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotConnectTimeOverTime", "#overviewConnectTimeOverTime");
        $('#footerConnectTimeOverTime .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

var responseTimePercentilesOverTimeInfos = {
        data: {"result": {"minY": 48.0, "minX": 1.78478358E12, "maxY": 6945.0, "series": [{"data": [[1.78478358E12, 6945.0]], "isOverall": false, "label": "Max", "isController": false}, {"data": [[1.78478358E12, 48.0]], "isOverall": false, "label": "Min", "isController": false}, {"data": [[1.78478358E12, 1624.5000000000005]], "isOverall": false, "label": "90th percentile", "isController": false}, {"data": [[1.78478358E12, 5145.39]], "isOverall": false, "label": "99th percentile", "isController": false}, {"data": [[1.78478358E12, 562.5]], "isOverall": false, "label": "Median", "isController": false}, {"data": [[1.78478358E12, 2145.7]], "isOverall": false, "label": "95th percentile", "isController": false}], "supportsControllersDiscrimination": false, "granularity": 60000, "maxX": 1.78478358E12, "title": "Response Time Percentiles Over Time (successful requests only)"}},
        getOptions: function() {
            return {
                series: {
                    lines: {
                        show: true,
                        fill: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Response Time in ms",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: '#legendResponseTimePercentilesOverTime'
                },
                selection: {
                    mode: 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s : at %x Response time was %y ms"
                }
            };
        },
        createGraph: function () {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesResponseTimePercentilesOverTime"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotResponseTimePercentilesOverTime"), dataset, options);
            // setup overview
            $.plot($("#overviewResponseTimePercentilesOverTime"), dataset, prepareOverviewOptions(options));
        }
};

// Response Time Percentiles Over Time
function refreshResponseTimePercentilesOverTime(fixTimestamps) {
    var infos = responseTimePercentilesOverTimeInfos;
    prepareSeries(infos.data);
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotResponseTimePercentilesOverTime"))) {
        infos.createGraph();
    }else {
        var choiceContainer = $("#choicesResponseTimePercentilesOverTime");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotResponseTimePercentilesOverTime", "#overviewResponseTimePercentilesOverTime");
        $('#footerResponseTimePercentilesOverTime .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};


var responseTimeVsRequestInfos = {
    data: {"result": {"minY": 260.0, "minX": 1.0, "maxY": 2483.0, "series": [{"data": [[8.0, 1309.0], [2.0, 1088.0], [9.0, 965.5], [10.0, 434.0], [11.0, 871.0], [3.0, 1594.0], [12.0, 455.0], [13.0, 541.5], [15.0, 567.0], [4.0, 1483.0], [1.0, 2483.0], [16.0, 431.0], [18.0, 605.5], [19.0, 639.0], [20.0, 345.5], [5.0, 278.0], [21.0, 601.0], [22.0, 281.5], [23.0, 372.0], [24.0, 400.5], [7.0, 1018.5], [30.0, 260.0]], "isOverall": false, "label": "Successes", "isController": false}], "supportsControllersDiscrimination": false, "granularity": 1000, "maxX": 30.0, "title": "Response Time Vs Request"}},
    getOptions: function() {
        return {
            series: {
                lines: {
                    show: false
                },
                points: {
                    show: true
                }
            },
            xaxis: {
                axisLabel: "Global number of requests per second",
                axisLabelUseCanvas: true,
                axisLabelFontSizePixels: 12,
                axisLabelFontFamily: 'Verdana, Arial',
                axisLabelPadding: 20,
            },
            yaxis: {
                axisLabel: "Median Response Time in ms",
                axisLabelUseCanvas: true,
                axisLabelFontSizePixels: 12,
                axisLabelFontFamily: 'Verdana, Arial',
                axisLabelPadding: 20,
            },
            legend: {
                noColumns: 2,
                show: true,
                container: '#legendResponseTimeVsRequest'
            },
            selection: {
                mode: 'xy'
            },
            grid: {
                hoverable: true // IMPORTANT! this is needed for tooltip to work
            },
            tooltip: true,
            tooltipOpts: {
                content: "%s : Median response time at %x req/s was %y ms"
            },
            colors: ["#9ACD32", "#FF6347"]
        };
    },
    createGraph: function () {
        var data = this.data;
        var dataset = prepareData(data.result.series, $("#choicesResponseTimeVsRequest"));
        var options = this.getOptions();
        prepareOptions(options, data);
        $.plot($("#flotResponseTimeVsRequest"), dataset, options);
        // setup overview
        $.plot($("#overviewResponseTimeVsRequest"), dataset, prepareOverviewOptions(options));

    }
};

// Response Time vs Request
function refreshResponseTimeVsRequest() {
    var infos = responseTimeVsRequestInfos;
    prepareSeries(infos.data);
    if (isGraph($("#flotResponseTimeVsRequest"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesResponseTimeVsRequest");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotResponseTimeVsRequest", "#overviewResponseTimeVsRequest");
        $('#footerResponseRimeVsRequest .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};


var latenciesVsRequestInfos = {
    data: {"result": {"minY": 169.0, "minX": 1.0, "maxY": 1485.5, "series": [{"data": [[8.0, 1130.5], [2.0, 1053.5], [9.0, 711.0], [10.0, 379.5], [11.0, 822.0], [3.0, 1136.0], [12.0, 409.0], [13.0, 471.5], [15.0, 509.0], [4.0, 867.5], [1.0, 1485.5], [16.0, 409.0], [18.0, 603.5], [19.0, 475.0], [20.0, 267.0], [5.0, 265.0], [21.0, 456.0], [22.0, 245.5], [23.0, 169.0], [24.0, 327.0], [7.0, 830.5], [30.0, 215.0]], "isOverall": false, "label": "Successes", "isController": false}], "supportsControllersDiscrimination": false, "granularity": 1000, "maxX": 30.0, "title": "Latencies Vs Request"}},
    getOptions: function() {
        return{
            series: {
                lines: {
                    show: false
                },
                points: {
                    show: true
                }
            },
            xaxis: {
                axisLabel: "Global number of requests per second",
                axisLabelUseCanvas: true,
                axisLabelFontSizePixels: 12,
                axisLabelFontFamily: 'Verdana, Arial',
                axisLabelPadding: 20,
            },
            yaxis: {
                axisLabel: "Median Latency in ms",
                axisLabelUseCanvas: true,
                axisLabelFontSizePixels: 12,
                axisLabelFontFamily: 'Verdana, Arial',
                axisLabelPadding: 20,
            },
            legend: { noColumns: 2,show: true, container: '#legendLatencyVsRequest' },
            selection: {
                mode: 'xy'
            },
            grid: {
                hoverable: true // IMPORTANT! this is needed for tooltip to work
            },
            tooltip: true,
            tooltipOpts: {
                content: "%s : Median Latency time at %x req/s was %y ms"
            },
            colors: ["#9ACD32", "#FF6347"]
        };
    },
    createGraph: function () {
        var data = this.data;
        var dataset = prepareData(data.result.series, $("#choicesLatencyVsRequest"));
        var options = this.getOptions();
        prepareOptions(options, data);
        $.plot($("#flotLatenciesVsRequest"), dataset, options);
        // setup overview
        $.plot($("#overviewLatenciesVsRequest"), dataset, prepareOverviewOptions(options));
    }
};

// Latencies vs Request
function refreshLatenciesVsRequest() {
        var infos = latenciesVsRequestInfos;
        prepareSeries(infos.data);
        if(isGraph($("#flotLatenciesVsRequest"))){
            infos.createGraph();
        }else{
            var choiceContainer = $("#choicesLatencyVsRequest");
            createLegend(choiceContainer, infos);
            infos.createGraph();
            setGraphZoomable("#flotLatenciesVsRequest", "#overviewLatenciesVsRequest");
            $('#footerLatenciesVsRequest .legendColorBox > div').each(function(i){
                $(this).clone().prependTo(choiceContainer.find("li").eq(i));
            });
        }
};

var hitsPerSecondInfos = {
        data: {"result": {"minY": 8.333333333333334, "minX": 1.78478358E12, "maxY": 8.333333333333334, "series": [{"data": [[1.78478358E12, 8.333333333333334]], "isOverall": false, "label": "hitsPerSecond", "isController": false}], "supportsControllersDiscrimination": false, "granularity": 60000, "maxX": 1.78478358E12, "title": "Hits Per Second"}},
        getOptions: function() {
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Number of hits / sec",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: "#legendHitsPerSecond"
                },
                selection: {
                    mode : 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s at %x was %y.2 hits/sec"
                }
            };
        },
        createGraph: function createGraph() {
            var data = this.data;
            var dataset = prepareData(data.result.series, $("#choicesHitsPerSecond"));
            var options = this.getOptions();
            prepareOptions(options, data);
            $.plot($("#flotHitsPerSecond"), dataset, options);
            // setup overview
            $.plot($("#overviewHitsPerSecond"), dataset, prepareOverviewOptions(options));
        }
};

// Hits per second
function refreshHitsPerSecond(fixTimestamps) {
    var infos = hitsPerSecondInfos;
    prepareSeries(infos.data);
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if (isGraph($("#flotHitsPerSecond"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesHitsPerSecond");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotHitsPerSecond", "#overviewHitsPerSecond");
        $('#footerHitsPerSecond .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
}

var codesPerSecondInfos = {
        data: {"result": {"minY": 8.333333333333334, "minX": 1.78478358E12, "maxY": 8.333333333333334, "series": [{"data": [[1.78478358E12, 8.333333333333334]], "isOverall": false, "label": "200", "isController": false}], "supportsControllersDiscrimination": false, "granularity": 60000, "maxX": 1.78478358E12, "title": "Codes Per Second"}},
        getOptions: function(){
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Number of responses / sec",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: "#legendCodesPerSecond"
                },
                selection: {
                    mode: 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "Number of Response Codes %s at %x was %y.2 responses / sec"
                }
            };
        },
    createGraph: function() {
        var data = this.data;
        var dataset = prepareData(data.result.series, $("#choicesCodesPerSecond"));
        var options = this.getOptions();
        prepareOptions(options, data);
        $.plot($("#flotCodesPerSecond"), dataset, options);
        // setup overview
        $.plot($("#overviewCodesPerSecond"), dataset, prepareOverviewOptions(options));
    }
};

// Codes per second
function refreshCodesPerSecond(fixTimestamps) {
    var infos = codesPerSecondInfos;
    prepareSeries(infos.data);
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotCodesPerSecond"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesCodesPerSecond");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotCodesPerSecond", "#overviewCodesPerSecond");
        $('#footerCodesPerSecond .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

var transactionsPerSecondInfos = {
        data: {"result": {"minY": 8.333333333333334, "minX": 1.78478358E12, "maxY": 8.333333333333334, "series": [{"data": [[1.78478358E12, 8.333333333333334]], "isOverall": false, "label": "HTTP Request-success", "isController": false}], "supportsControllersDiscrimination": true, "granularity": 60000, "maxX": 1.78478358E12, "title": "Transactions Per Second"}},
        getOptions: function(){
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Number of transactions / sec",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: "#legendTransactionsPerSecond"
                },
                selection: {
                    mode: 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s at %x was %y transactions / sec"
                }
            };
        },
    createGraph: function () {
        var data = this.data;
        var dataset = prepareData(data.result.series, $("#choicesTransactionsPerSecond"));
        var options = this.getOptions();
        prepareOptions(options, data);
        $.plot($("#flotTransactionsPerSecond"), dataset, options);
        // setup overview
        $.plot($("#overviewTransactionsPerSecond"), dataset, prepareOverviewOptions(options));
    }
};

// Transactions per second
function refreshTransactionsPerSecond(fixTimestamps) {
    var infos = transactionsPerSecondInfos;
    prepareSeries(infos.data);
    if(infos.data.result.series.length == 0) {
        setEmptyGraph("#bodyTransactionsPerSecond");
        return;
    }
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotTransactionsPerSecond"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesTransactionsPerSecond");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotTransactionsPerSecond", "#overviewTransactionsPerSecond");
        $('#footerTransactionsPerSecond .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

var totalTPSInfos = {
        data: {"result": {"minY": 8.333333333333334, "minX": 1.78478358E12, "maxY": 8.333333333333334, "series": [{"data": [[1.78478358E12, 8.333333333333334]], "isOverall": false, "label": "Transaction-success", "isController": false}, {"data": [], "isOverall": false, "label": "Transaction-failure", "isController": false}], "supportsControllersDiscrimination": true, "granularity": 60000, "maxX": 1.78478358E12, "title": "Total Transactions Per Second"}},
        getOptions: function(){
            return {
                series: {
                    lines: {
                        show: true
                    },
                    points: {
                        show: true
                    }
                },
                xaxis: {
                    mode: "time",
                    timeformat: getTimeFormat(this.data.result.granularity),
                    axisLabel: getElapsedTimeLabel(this.data.result.granularity),
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20,
                },
                yaxis: {
                    axisLabel: "Number of transactions / sec",
                    axisLabelUseCanvas: true,
                    axisLabelFontSizePixels: 12,
                    axisLabelFontFamily: 'Verdana, Arial',
                    axisLabelPadding: 20
                },
                legend: {
                    noColumns: 2,
                    show: true,
                    container: "#legendTotalTPS"
                },
                selection: {
                    mode: 'xy'
                },
                grid: {
                    hoverable: true // IMPORTANT! this is needed for tooltip to
                                    // work
                },
                tooltip: true,
                tooltipOpts: {
                    content: "%s at %x was %y transactions / sec"
                },
                colors: ["#9ACD32", "#FF6347"]
            };
        },
    createGraph: function () {
        var data = this.data;
        var dataset = prepareData(data.result.series, $("#choicesTotalTPS"));
        var options = this.getOptions();
        prepareOptions(options, data);
        $.plot($("#flotTotalTPS"), dataset, options);
        // setup overview
        $.plot($("#overviewTotalTPS"), dataset, prepareOverviewOptions(options));
    }
};

// Total Transactions per second
function refreshTotalTPS(fixTimestamps) {
    var infos = totalTPSInfos;
    // We want to ignore seriesFilter
    prepareSeries(infos.data, false, true);
    if(fixTimestamps) {
        fixTimeStamps(infos.data.result.series, 19800000);
    }
    if(isGraph($("#flotTotalTPS"))){
        infos.createGraph();
    }else{
        var choiceContainer = $("#choicesTotalTPS");
        createLegend(choiceContainer, infos);
        infos.createGraph();
        setGraphZoomable("#flotTotalTPS", "#overviewTotalTPS");
        $('#footerTotalTPS .legendColorBox > div').each(function(i){
            $(this).clone().prependTo(choiceContainer.find("li").eq(i));
        });
    }
};

// Collapse the graph matching the specified DOM element depending the collapsed
// status
function collapse(elem, collapsed){
    if(collapsed){
        $(elem).parent().find(".fa-chevron-up").removeClass("fa-chevron-up").addClass("fa-chevron-down");
    } else {
        $(elem).parent().find(".fa-chevron-down").removeClass("fa-chevron-down").addClass("fa-chevron-up");
        if (elem.id == "bodyBytesThroughputOverTime") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshBytesThroughputOverTime(true);
            }
            document.location.href="#bytesThroughputOverTime";
        } else if (elem.id == "bodyLatenciesOverTime") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshLatenciesOverTime(true);
            }
            document.location.href="#latenciesOverTime";
        } else if (elem.id == "bodyCustomGraph") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshCustomGraph(true);
            }
            document.location.href="#responseCustomGraph";
        } else if (elem.id == "bodyConnectTimeOverTime") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshConnectTimeOverTime(true);
            }
            document.location.href="#connectTimeOverTime";
        } else if (elem.id == "bodyResponseTimePercentilesOverTime") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshResponseTimePercentilesOverTime(true);
            }
            document.location.href="#responseTimePercentilesOverTime";
        } else if (elem.id == "bodyResponseTimeDistribution") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshResponseTimeDistribution();
            }
            document.location.href="#responseTimeDistribution" ;
        } else if (elem.id == "bodySyntheticResponseTimeDistribution") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshSyntheticResponseTimeDistribution();
            }
            document.location.href="#syntheticResponseTimeDistribution" ;
        } else if (elem.id == "bodyActiveThreadsOverTime") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshActiveThreadsOverTime(true);
            }
            document.location.href="#activeThreadsOverTime";
        } else if (elem.id == "bodyTimeVsThreads") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshTimeVsThreads();
            }
            document.location.href="#timeVsThreads" ;
        } else if (elem.id == "bodyCodesPerSecond") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshCodesPerSecond(true);
            }
            document.location.href="#codesPerSecond";
        } else if (elem.id == "bodyTransactionsPerSecond") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshTransactionsPerSecond(true);
            }
            document.location.href="#transactionsPerSecond";
        } else if (elem.id == "bodyTotalTPS") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshTotalTPS(true);
            }
            document.location.href="#totalTPS";
        } else if (elem.id == "bodyResponseTimeVsRequest") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshResponseTimeVsRequest();
            }
            document.location.href="#responseTimeVsRequest";
        } else if (elem.id == "bodyLatenciesVsRequest") {
            if (isGraph($(elem).find('.flot-chart-content')) == false) {
                refreshLatenciesVsRequest();
            }
            document.location.href="#latencyVsRequest";
        }
    }
}

/*
 * Activates or deactivates all series of the specified graph (represented by id parameter)
 * depending on checked argument.
 */
function toggleAll(id, checked){
    var placeholder = document.getElementById(id);

    var cases = $(placeholder).find(':checkbox');
    cases.prop('checked', checked);
    $(cases).parent().children().children().toggleClass("legend-disabled", !checked);

    var choiceContainer;
    if ( id == "choicesBytesThroughputOverTime"){
        choiceContainer = $("#choicesBytesThroughputOverTime");
        refreshBytesThroughputOverTime(false);
    } else if(id == "choicesResponseTimesOverTime"){
        choiceContainer = $("#choicesResponseTimesOverTime");
        refreshResponseTimeOverTime(false);
    }else if(id == "choicesResponseCustomGraph"){
        choiceContainer = $("#choicesResponseCustomGraph");
        refreshCustomGraph(false);
    } else if ( id == "choicesLatenciesOverTime"){
        choiceContainer = $("#choicesLatenciesOverTime");
        refreshLatenciesOverTime(false);
    } else if ( id == "choicesConnectTimeOverTime"){
        choiceContainer = $("#choicesConnectTimeOverTime");
        refreshConnectTimeOverTime(false);
    } else if ( id == "choicesResponseTimePercentilesOverTime"){
        choiceContainer = $("#choicesResponseTimePercentilesOverTime");
        refreshResponseTimePercentilesOverTime(false);
    } else if ( id == "choicesResponseTimePercentiles"){
        choiceContainer = $("#choicesResponseTimePercentiles");
        refreshResponseTimePercentiles();
    } else if(id == "choicesActiveThreadsOverTime"){
        choiceContainer = $("#choicesActiveThreadsOverTime");
        refreshActiveThreadsOverTime(false);
    } else if ( id == "choicesTimeVsThreads"){
        choiceContainer = $("#choicesTimeVsThreads");
        refreshTimeVsThreads();
    } else if ( id == "choicesSyntheticResponseTimeDistribution"){
        choiceContainer = $("#choicesSyntheticResponseTimeDistribution");
        refreshSyntheticResponseTimeDistribution();
    } else if ( id == "choicesResponseTimeDistribution"){
        choiceContainer = $("#choicesResponseTimeDistribution");
        refreshResponseTimeDistribution();
    } else if ( id == "choicesHitsPerSecond"){
        choiceContainer = $("#choicesHitsPerSecond");
        refreshHitsPerSecond(false);
    } else if(id == "choicesCodesPerSecond"){
        choiceContainer = $("#choicesCodesPerSecond");
        refreshCodesPerSecond(false);
    } else if ( id == "choicesTransactionsPerSecond"){
        choiceContainer = $("#choicesTransactionsPerSecond");
        refreshTransactionsPerSecond(false);
    } else if ( id == "choicesTotalTPS"){
        choiceContainer = $("#choicesTotalTPS");
        refreshTotalTPS(false);
    } else if ( id == "choicesResponseTimeVsRequest"){
        choiceContainer = $("#choicesResponseTimeVsRequest");
        refreshResponseTimeVsRequest();
    } else if ( id == "choicesLatencyVsRequest"){
        choiceContainer = $("#choicesLatencyVsRequest");
        refreshLatenciesVsRequest();
    }
    var color = checked ? "black" : "#818181";
    if(choiceContainer != null) {
        choiceContainer.find("label").each(function(){
            this.style.color = color;
        });
    }
}

