package service;

import 행정.ModelOrder;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionService {
    public <T> Field[] getSortReflectionItem(List<T> dataList, int i) throws NoSuchFieldException, IllegalAccessException {
//    var data = dataList.get(i).getClass();
//    Field filed품명 = data.getDeclaredField("품명");
//    Field filed입고량 = data.getDeclaredField("입고량");
//    Field filed입고일자 = data.getDeclaredField("입고일자");
//    Field filed출고량 = data.getDeclaredField("출고량");
//    Field filed출고일자 = data.getDeclaredField("출고일자");
//    Field filed합계 = data.getDeclaredField("합계");
//    Field filed비고 = data.getDeclaredField("비고");
//
//    Field[] fields = new Field[7];
//    fields[0] = filed품명;
//    fields[1] = filed입고량;
//    fields[2] = filed입고일자;
//    fields[3] = filed출고량;
//    fields[4] = filed출고일자;
//    fields[5] = filed합계;
//    fields[6] = filed비고;
//    for (int i1 = 0; i1 < fields.length; i1++) {
//      fields[i1].setAccessible(true);
//    }

        var dataField = dataList.get(i).getClass().getDeclaredFields();

        for (Field s : dataField) {
            s.setAccessible(true);
            System.out.println(s);
        }

        var sorted = Arrays.stream(dataField).sorted(
                Comparator.comparingInt(
                        m -> m.getAnnotation(ModelOrder.class).order()
                )
        ).collect(Collectors.toList());

        return sorted.toArray(Field[]::new);
    }


    public <T> Field[] getSortReflectionTitle(T data){
        var dataFields = data.getClass().getDeclaredFields();
        for (Field dataField : dataFields) {
            dataField.setAccessible(true);
        }
        var sorted = Arrays.stream(dataFields).sorted(
                Comparator.comparingInt(
                        m -> m.getAnnotation(ModelOrder.class).order()
                )
        ).collect(Collectors.toList());
        return sorted.toArray(Field[]::new);
    }
}
