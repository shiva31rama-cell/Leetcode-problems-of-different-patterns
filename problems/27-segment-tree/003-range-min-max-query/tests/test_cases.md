# Tests

1. `[5,2,7,1,6]`, query(1,3) → `[1,7]`
2. Update index 3 to 9, query(1,4) → `[2,9]`
3. Single element `[8]`, query(0,0) → `[8,8]`
4. Negative values `[-4,-2,-9]`, query(0,2) → `[-9,-2]`

Regression: verify both min and max after point updates.