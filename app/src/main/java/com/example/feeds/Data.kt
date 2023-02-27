package com.example.feeds

object Data {

    fun getMaterial(): List<MaterialsData> {
        val MaterialList = ArrayList<MaterialsData>()
        MaterialList.add(MaterialsData("ذرة", 9))
        MaterialList.add(MaterialsData("شعير", 12))
        MaterialList.add(MaterialsData("قمح", 12))
        MaterialList.add(MaterialsData("ردة", 12))
        MaterialList.add(MaterialsData("كسر الرز", 25))
        MaterialList.add(MaterialsData("فول الصويا", 35))
        MaterialList.add(MaterialsData("مشمش", 28))
        MaterialList.add(MaterialsData("بذرة عباد الشمس", 40))
        MaterialList.add(MaterialsData("نواة البلح", 20))
        MaterialList.add(MaterialsData("البطاطس", 7))
        MaterialList.add(MaterialsData("بطاطا", 10))
        MaterialList.add(MaterialsData("مخلفات الاسماك", 35))
        MaterialList.add(MaterialsData("قشور الجمبري", 40))
        MaterialList.add(MaterialsData("ريش الدواجن", 20))
        MaterialList.add(MaterialsData("فضلات الطعام", 10))
        MaterialList.add(MaterialsData("قشر الموز/البرتقال/ البيض", 5))
        return MaterialList
    }
}