package com.example.thigk2

import com.example.thi_gk2.ProvinceModal
import com.example.thi_gk2.R

object Constant{
    val IMAGE_REQUEST_CODE =100

    fun getQuestions(): ArrayList<ProvinceModal>{
        val questionList = ArrayList<ProvinceModal>()

        val q1 = ProvinceModal(
            R.drawable.anhsinhvien, "Nguyễn Văn A",
            2002,
            "abc",
        )
        questionList.add(q1)

        val q2 = ProvinceModal(R.drawable.anhsinhvien, "Tôn Thất Hội",
            2002,
            "cde",
        )
        questionList.add(q2)

        val q3 = ProvinceModal(R.drawable.anhsinhvien, "Nguyễn Thị C",
            2003,
            "abc",
        )
        questionList.add(q3)

        val q4 = ProvinceModal(R.drawable.anhsinhvien, "Nguyễn Thị D",
            2003,
            "abc",
        )
        questionList.add(q4)

        val q5 = ProvinceModal(R.drawable.anhsinhvien, "Nguyễn Thị E",
            2003,
            "abc",
        )
        questionList.add(q5)

        val q6 = ProvinceModal(R.drawable.anhsinhvien, "Nguyễn Thị F",
            2003,
            "abc",
        )
        questionList.add(q6)

        val q7 = ProvinceModal(R.drawable.anhsinhvien, "Nguyễn Thị G",
            2003,
            "abc",
        )
        questionList.add(q7)

        return questionList

    }

}